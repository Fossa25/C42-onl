package homework13;

public class WrongLoginException extends Exception {
    private final String login;
     public static final String RED = "\u001B[31m";

    public WrongLoginException(String login,String message) {
      super(message);
      this.login = login;
    }

  @Override
  public String toString() {
    return RED+"В веденном логине "+ this.login + " ошибка - " + "\n\t"+ getMessage();
  }
}
