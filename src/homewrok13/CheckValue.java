package homewrok13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValue extends SetStringUser{
    static Pattern pattern = Pattern.compile("^[A-zА-я1-9]{1,20}$");
    static Pattern pattern1 = Pattern.compile("\\s");
    static Pattern pattern2 = Pattern.compile("\\d");

    public static void checkValueUser(){
       boolean result;
        System.out.println(BLUE+"Добрый день, пора войти в программу");
        try {
            System.out.println(YELLOW+"Введите логин:");
            checkUserLogin(getInput());
            System.out.println(YELLOW+"Введите пароль:");
           String pas = checkUserPassword(getInput());
            System.out.println(YELLOW+"Повторите введенный пароль ранее");
            checkConfirmPassword(pas,getInput());
            result = true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            result =false;
        }
        if ((result)) {
            System.out.println(BLUE+"Ты справился держи печеньку! Это типо true)");
        } else {
            System.out.println(BLUE+"А ну ка соберись! И попробуй ещё раз. Это типо false( ");
        }
    }
    public static void checkUserLogin (String login) throws  WrongLoginException{
        Matcher matcher = pattern.matcher(login);
        Matcher matcher1 = pattern1.matcher(login);
        if (login.isEmpty() ){
            throw new WrongLoginException(login,BOLT+"Ничего не введено"+RESET);
        }
        if (matcher1.find() ){
            throw new WrongLoginException(login,BOLT+"Находится пробел"+RESET);
        }
        if (!matcher.find()){
            throw new WrongLoginException(login,BOLT+"Больше 20 символов"+RESET);
            }
        System.out.println(GREEN+"Логин ввёден идеально" + RESET);
    }
    public static String checkUserPassword (String password) throws  WrongPasswordException{
        Matcher matcher = pattern.matcher(password);
        Matcher matcher1 = pattern1.matcher(password);
        Matcher matcher2 = pattern2.matcher(password);
        if (password.isEmpty() ){
            throw new WrongPasswordException(password,BOLT+"Ничего не введено"+RESET);
        }
        if (matcher1.find() ){
            throw new WrongPasswordException(password,BOLT+"Находится пробел"+RESET);
        }
        if (!matcher.find()){
            throw new WrongPasswordException(password,BOLT+"Больше 20 символов"+RESET);
        }
        if (!matcher2.find()){
            throw new WrongPasswordException(password,BOLT+"Должен содержать хотя бы одну цифру"+RESET);
        }
        System.out.println(GREEN+"Пароль ввёден шикарно" + RESET);
        return password;
    }
    public static void checkConfirmPassword (String password,String confirmPassword) throws  WrongPasswordException{
        if (!password.equals(confirmPassword) ){
            throw new WrongPasswordException(confirmPassword,BOLT+"Он не совпадает с введённым ранее паролем"+RESET);
        }
        System.out.println(GREEN+"Пароли совпадают" + RESET);
    }
}