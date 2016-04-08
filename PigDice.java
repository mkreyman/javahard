import java.util.Scanner;

public class PigDice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int roll, personTotal, compTotal, turnTotal, tally;
    String choice = "";

    personTotal = 0;
    compTotal = 0;
    tally = 0;

    do {
      turnTotal = 0;
      System.out.println("You have " + personTotal + " points.");

      do {
        roll = 1 + (int)(Math.random()*6);
        System.out.println("\tYou rolled a " + roll + ".");
        if (roll == 1) {
          System.out.println("\tThat ends your turn.");
          turnTotal = 0;
        }
        else {
          turnTotal += roll;
          System.out.print("\tYou have " + turnTotal + " points");
          System.out.print(" so far this round.\n");
          System.out.print("\tWould you like to \"roll\" again");
          System.out.print(" or \"hold\"? ");
          choice = keyboard.next();
        }
      } while ( roll != 1 && choice.equals("roll") );

      personTotal += turnTotal;
      System.out.println("\tYou end the round with " + personTotal + " points.");

      if ( personTotal < 100 ) {
        turnTotal = 0;
        System.out.println("Computer has " + compTotal + " points.");

        do {
          roll = 1 + (int)(Math.random()*6);
          System.out.println("\tComputer rolled a " + roll + ".");
          if ( roll == 1 ) {
            System.out.println("\tThat ends its turn.");
            turnTotal = 0;
          }
          else {
            turnTotal += roll;
            tally = compTotal + turnTotal;
            System.out.print("\tComputer has " + turnTotal);
            System.out.print(" points so far this round.\n");
            if ( turnTotal < 20 && tally < 100 ) {
              System.out.println("\tComputer will roll again.");
            }
          }
        } while ( roll != 1 && turnTotal < 20 && tally < 100 );

        compTotal += turnTotal;
        System.out.print("\tComputer ends the round with ");
        System.out.print( compTotal + " points.\n");
      }
    } while ( personTotal < 100 && compTotal < 100 );

    if ( personTotal > compTotal ) {
      System.out.println("Humanity wins!");
    }
    else {
      System.out.println("The computer wins.");
    }
  }
}
