package p4;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\ssp\\demo.xlsx");   //creating a new file instance  
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		Iterator<Row> itr = sheet.iterator();    //iterating over excel file
		int num;
		String s1,name,city;
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","jneccse");
		String sql;
		for(Row row :sheet) {
			if(row.getRowNum()==0) {
				continue;
			}
			num = (int)row.getCell(0).getNumericCellValue();
			name = row.getCell(1).toString();
			city = row.getCell(2).toString();
			sql="insert into employee values(?,?,?)";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, name);
			psmt.setString(3, city);
			psmt.execute();
			System.out.println(num +"\t"+ name + "\t"+city);
		}
		
			
	}}
