import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double lb, kg, ft, in, m, bmi;

    // System.out.print( "Enter your BMI: " );
    // bmi = keyboard.nextDouble();

    System.out.print( "Enter your weight (in pounds): " );
    lb = keyboard.nextDouble();

    System.out.print( "Enter your height (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Enter your height (inches): " );
    in = keyboard.nextDouble() + ft * 12;

    kg = lb / 2.20462;
    m = in / 39.3701;
    bmi = kg / (m*m);

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
