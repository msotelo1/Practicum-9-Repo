// Practicum 9 (if statements in Java)
// (TO UPDATE)
//--------------------------------------------------------
// A year is a leap_year if is divisible by 4, except:
//
//   - is also divisible by 100, it is NOT a leap year.
//   - is also divisible by 400, it IS a leap year.
//--------------------------------------------------------
public class Main {
  public static void main(String[] args) {
    System.out.println("\nPRACTICUM on if statements in Java\n");
    System.out.println(
         "Will determine if a given year is a leap_year year.\n");
      
    // declare input Scanner 
    Scanner input = new Scanner(System.in);

    // get input
    System.out.print("Enter year: ");
    year = input.nextInt();
    
    // init to false
    boolean leap_year = false;

    // year is divisible by 4?
    if (year % 4 == 0) {

      // is also divisible by 100?
      if (year % 100 = 0) {

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
