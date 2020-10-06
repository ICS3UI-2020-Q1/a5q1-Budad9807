import java.util.Scanner;
/**
 *When a user types a interger creates a multiplication table
 * @author David
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Asking the user to enter a interger
    System.out.println("Please enter a interger");
    int num = input.nextInt();
   // create a loop the creates a multiplication table when interger is entered
   for(int count =1; count <= 12; count++){
     int j = num * count;
     // it loop the interger that is enter and multipes it to 1 to 12
     System.out.println(j);
   }
     System.out.println("There is your multiplication table:)");

    
  }
}
