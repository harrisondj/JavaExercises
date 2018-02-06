import java.util.Scanner;

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();
    Scanner scanner = new Scanner(System.in);  
    // search for "Violet Smith"
    System.out.println("Name?");
    String first_name = scanner.next();
    String last_name = scanner.next();
    first_name.toUpperCase();
    last_name.toUpperCase();
    System.out.println(first_name + last_name);
    PhoneEntry entry = pb.search(first_name + " " + last_name); 

    if ( entry != null )
      System.out.println( entry.getName() + ": " + entry.getPhone() );
    else
      System.out.println("Name not found" );

  }
}