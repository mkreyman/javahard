import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String password, pw_entry;
    int pin, entry;

    password = "unbreakable";
    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PASSWORD: ");
    pw_entry = keyboard.nextLine();

    while (! pw_entry.equals("unbreakable")) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      pw_entry = keyboard.nextLine();
    }

    System.out.print("PASSWORD ACCEPTED. NOW ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
