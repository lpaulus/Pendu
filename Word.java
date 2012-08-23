public class Word {
  private String looking = "amour";
  private boolean[] found = new boolean[5];
  public boolean all_found () {
    int check = 0;
    for (int i = 0; i < found.length; i++) {
      if (found[i] == false) {
        check++;
      }
    }
    return (check==0);
  }
  public void display () {
    int i=0;
    while (looking.length() > i) {
      if (found[i]) {
        System.out.print(looking.charAt(i));
      } else {
        System.out.print("_");
      }
      i=i+1;
    }
    System.out.println();
  }
  public boolean checkLetter (char l) {
    int i=0;
    int passage=0;
    while (looking.length() > i) {
      if (l == looking.charAt(i)) {
        found[i] = true;
        passage=passage+1;
      }
      i=i+1;
    }
    return (passage>0);
  }
}
