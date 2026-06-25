package homework6;

public class CreditCard {
    public String cartNumber;
    public double cartMoney;
    boolean translationOperation;
    public void informCart(double money){
        System.out.println("На карте с номером счета - " + cartNumber + " находится сумма - " + money);

    }
    public  double accrueMony(double translation ){
        informCart(cartMoney);
        System.out.println("Зачислен перевод на сумму - " + translation);
        informCart((cartMoney+translation));
        System.out.println("-".repeat(70));
        return cartMoney+translation;
    }
    public double withdrawMoney(double translation ){
        informCart(cartMoney);
        if (translation>cartMoney){
            System.out.println("Снять на сумму - " + translation + " невозможно т.к." + "на карте - "+ cartMoney );
            System.out.println("-".repeat(70));
            translationOperation=false;
            return cartMoney;
        }else {
        System.out.println("Снято на сумму - " + translation);
        informCart((cartMoney-translation));
        System.out.println("-".repeat(70));
            translationOperation=true;
        return cartMoney-translation;
        }

    }
}
