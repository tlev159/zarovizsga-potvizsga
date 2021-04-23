package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

  public boolean hasMoreDigits(String s) {
    if (isWordEmpty(s)) return false;
    return hasWordMoreDigits(s);
  }

  private boolean hasWordMoreDigits(String s) {
    int numberOfDigits = 0;
    for (char c: s.toCharArray()) {
      if (Character.isDigit(c)) {
        numberOfDigits++;
      }
    }
    return (numberOfDigits > s.length() - numberOfDigits) ? true:false;
  }

  private boolean isWordEmpty(String s) {
    if (s.isEmpty()) {
      return true;
    }
    return false;
  }
}
