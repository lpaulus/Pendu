public class Main {
  public static void main (String[] args) {
    // Création du mot
    java.util.Scanner s = new java.util.Scanner(System.in);
    Word w = new Word ();
    int chance=8;
    while (chance > 0 && !w.all_found()) {
      // Affichage
      System.out.println("You still have "+chance+" try");
      w.display();  
      // Demande d'une lettre
      System.out.print("Give me a letter : ");
      String token = s.next();
      while (token.length() != 1) {
        System.out.print("Only one please... : ");
        token = s.next();
      }
      char chosen_letter = token.charAt(0);
      // Vérification et traitement
      if (w.checkLetter(chosen_letter)) {
        System.out.println("Well done.");
      }
      else {
        System.out.println("Nice try.");
        chance=chance-1;
      }
    }
    // Message d'au revoir
    if (w.all_found()) {
     System.out.println("You win !!!");
    }
     else {System.out.println("You lose");
    }
  }
}
