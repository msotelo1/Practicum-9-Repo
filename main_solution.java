// Practicum 9 (if statements in Java) Solution
//--------------------------------------------------------
// A year is a leap_year if is divisible by 4, except:
//
//   - is also divisible by 100, it is NOT a leap year.
//   - is also divisible by 400, it IS a leap year.
//--------------------------------------------------------
// CHANGE: Added import statement for Scanner class
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("\nPRACTICUM on if statements in Java\n");
    System.out.println(
         "Will determine if a given year is a leap_year year.\n");

    // declarations
    // CHANGE: Added int declaration for var year
    int year;
    Scanner input = new Scanner(System.in);

    // get input
    System.out.print("Enter year: ");
    year = input.nextInt();
    
    // init to false
    boolean leap_year = false;

    // year is divisible by 4?
    if (year % 4 == 0) {

      // is also divisible by 100?
      // CHANGE: replace 100 = 0 with 100 == 0
      if (year % 100 == 0) {

        // is also divisible by 400?
        if (year % 400 == 0)
          leap_year = true;
        // is not also divisible by 400
        else
          leap_year = false;
      }
      
      // divisible by 4 but not 100?
      else
        leap_year = true;
    }

    // is not divisible by 4
    else
      leap_year = false;

    if(leap_year)
      System.out.println(year + " is a leap year");
    else
      System.out.println(year + " is not a leap year");
  }
}
