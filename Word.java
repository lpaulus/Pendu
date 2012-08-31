import java.io.*;
import java.util.Random;

public class Word {
  private String looking;
  private boolean[] found;
  public Word () {
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader("Words"));
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
    int amount = 0;
    try {
      amount = Integer.parseInt(in.readLine());
    } catch (IOException e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    } catch (NumberFormatException e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
    Random ran = new Random();
    int index = ran.nextInt(amount);
    try {
      // skipping {index} words
      for (int i = 0; i < index; i++) {
        in.readLine();
      }
      // taking the next one
      looking = in.readLine();
    } catch (IOException e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
    looking = looking.toLowerCase();
    found = new boolean[looking.length()];
  }
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
