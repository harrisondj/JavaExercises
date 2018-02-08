import java.util.Scanner;

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();
    Scanner scanner = new Scanner(System.in);  
    // search for "Violet Smith"
    boolean quit = false;
    while (quit != true) {
      System.out.println("Name?");
      String first_name = scanner.nextLine();
      if (first_name.equals("quit")) {
        System.out.println("good-by");
        quit = true;
      } else {
        //System.out.println("Last_name");
        //String last_name = scanner.nextLine();
        //String name = first_name + " " + last_name;
        PhoneEntry entry = pb.search(first_name); 

        if ( entry != null )
          System.out.println( entry.getName() + ": " + entry.getPhone() );
        else
          System.out.println("Name not found" );
        
      }
      
    }

  }
}