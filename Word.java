public class Word {
  private String looking = "amour";
  private boolean[] found = new boolean[5];
  public boolean allFound () {
    int check = 0;
    for (int i = 0; i < found.length; i++) {
      if (found[i] == false) {
        check++;
      }
    }
    return (check == 0);
  }
  public void display () {
    for (int i = 0; i < looking.length(); i++) {
      if (found[i]) {
        System.out.print(looking.charAt(i));
      } else {
        System.out.print("_");
      }
    }
    System.out.println();
  }
  public boolean checkLetter (char l) {
    int passage = 0;
    for (int i = 0; i < looking.length(); i++) {
      if (l == looking.charAt(i)) {
        found[i] = true;
        passage++;
      }
    }
    return (0 < passage);
  }
}
