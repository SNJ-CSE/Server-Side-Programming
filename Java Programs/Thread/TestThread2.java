//Class to generate threads by extending the Thread class
public class TestThread2{
  // Main method 
  public static void main(String[] args) {
    // Create threads
    PrintChar printA = new PrintChar('a', 20);
    PrintChar printB = new PrintChar('b', 20);
    PrintNum  print20 = new PrintNum(20);

    // Start threads
    print20.start();
    printA.start();
    printB.start();
  }
}

// The thread class for printing a specified character a specified number of times
class PrintChar extends Thread {
  private char charToPrint;  // The character to print
  private int times;  // The times to repeat

  // Construct a thread with specified character and number of times to print the character
  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }  

// Override the run() method to tell the system what the thread will do
  public void run() {
    for (int i = 0; i < times; i++)
      System.out.print(charToPrint);
  }
}

// The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread {
  private int lastNum;

  // Construct a thread for print 1, 2, ... i 
  public PrintNum(int n) {
    lastNum = n;
  }

  // Tell the thread how to run 
  public void run() {
    for (int i = 1; i <= lastNum; i++)
	{
      System.out.print(" " + i);
        try {
                 if (i >= 5) Thread.sleep(1000);
        }
        catch (InterruptedException ex) { }
      }


//	Thread.yield();
  }
} //end class TestThread