import java.util.Scanner;

public class ShallowGrandmother {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age, myage = 50;
    double income, cute, happiness;
    boolean allowed, allowed2, ten_yrs_younger, makes_happy, makes_very_happy;

    System.out.print( "Enter your age: " );
    age = keyboard.nextInt();

    System.out.print( "Enter your early income: ");
    income = keyboard.nextDouble();

    System.out.print( "How cute are you, on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );

    // Study drills
    System.out.print( "How happy do you make them, on a scale from 0.0 to 10.0? ");
    happiness = keyboard.nextDouble();

    ten_yrs_younger = (age <= myage - 10);
    makes_happy = (happiness >= 7.0);
    makes_very_happy = (happiness >= 9.0);

    allowed2 = ( (ten_yrs_younger && makes_happy) || makes_very_happy );

    System.out.println( "Allowed to date my grandchild? " + ( allowed || allowed2 ) );
  }
}
