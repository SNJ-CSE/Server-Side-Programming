import java.io.*;
import javax.swing.*;

public class FileChooser {
        public static void main(String[] args) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename = f.getName();
                System.out.println("You have selected: " + filename);
        }
}


/*

 File file = new File("C:");
                long totalSpace = file.getTotalSpace();
                System.out.println("Total Space = " + totalSpace + " bytes");
        }
*/