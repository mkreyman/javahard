import java.util.Scanner;

public class BMICalculatorRoyal2 {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, ft, lb, m, kg, bmi;

    System.out.print( "Your height (feet only): ");
    ft = keyboard.nextDouble();
    System.out.print( "Your height (inches): ");
    in = keyboard.nextDouble() + ft * 12;
    // in = in + ft * 12;
    m = in / 39.3701;

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();
    kg = lb / 2.20462;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
