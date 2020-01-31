package practical3;

import java.calendar.date;

// TODO: There are many bugs in this program! Please fix them all!

// REMINDER: You can run this command to see compiler errors:
// gradle build

// REMINDER: You can run this command to assess completion of baseline checks:
// gradle grade

/** This class has a method that computes the distance to the moon in yards.
 * The first line displays the name of the programmer and the date. Then, the
 * program's main method stores some values in variables and performs a
 * computation for the number of yards to the moon. Ultimately, the class can
 * display the number of yards to the moon.
 *
 * <p>Bugs: This program has known bugs and it is missing source code.
 *
 * @author Add Your Name Here
 */

public ComputeMoonDistance {

  /** The main entry location for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   * @param args The command-line arguments
   **/
  public return void main(String args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare variables for the fixed distances
    int milesToMoon = 238855;
    int yardsPerMile = "1760";
    // declare the variable that will be computed
    int yardsToMoon;
    // compute the yards to the moon
    yardsToMoon = milesToMoon - yardsPerMile;
    // output the declared values stored in variables
    System.out.println("Distance to the moon in miles: " + milesToMoon);
  }

}
