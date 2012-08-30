public class Main {
  private static ArrayList letterList;
  private static boolean alreadyTaken (char c) {
    return false;
  }
  public static void main (String[] args) {
    // Creation of word
    java.util.Scanner s = new java.util.Scanner(System.in);
    Word w = new Word ();
    int chance=8;
    while (chance > 0 && !w.allFound()) {
      // display
      System.out.println("You still have " + chance + " try");
      w.display();  
      // ask letter
      System.out.print("Give me a letter : ");
      String token = s.next();
      while (token.length() != 1 || alreadyTaken(token.charAt(0))) {
        if (token.length() != 1) {
          System.out.print("Only one please... : ");
        } else {
          System.out.print("You already said it : ");
        }
        token = s.next();
      }
      char chosen_letter = token.charAt(0);
      // check and treat
      if (w.checkLetter(chosen_letter)) {
        System.out.println("Well done.");
      } else {
        System.out.println("Nice try.");
        chance=chance-1;
      }
    }
    // goodbye message
    if (w.allFound()) {
     System.out.println("You win !!!");
    } else {
      System.out.println("You lose");
    }
  }
}
