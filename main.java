import java.util.* 
  
public class Main {
  public static void main(String[] args) {
    System.out.println("\nPRACTICUM on if statements in Java\n");
    System.out.println("Will determine if a given year is a leap_year year.\n");
      
    Scanner input = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = input.nextInt();
    
    boolean leap_year = false;
    
    if (year % 4 == 0) 
    {
      if (year % 100 != 0) 
      {
        if (year % 400 == 0)
          leap_year = true;
        else
          leap_year = false;
      }
      else
        leap_year = false;
    }
    else
      leap_year = false;

    if(leap_year)
      System.out.println(year + " is a leap year");
    else
      System.out.println(year + " is not a leap year");
  }
}
