package homewrok13;

public class WrongPasswordException extends Exception {
    private final String password;
    public static final String RED = "\u001B[31m";

    public WrongPasswordException(String password,String message ) {
        super(message);
        this.password = password;
    }

  @Override
  public String toString() {
    return RED+"В веденном пароле ошибка - " +this.password + "\n\t"+ getMessage();
  }
}
