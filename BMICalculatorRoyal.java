import java.util.Scanner;

public class BMICalculatorRoyal {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, lb, m, kg, bmi;

    System.out.print( "Your height in inches: ");
    in = keyboard.nextDouble();
    m = in / 39.3701;

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();
    kg = lb / 2.20462;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
