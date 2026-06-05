package homework2;

public class Main {
    public static void main(String[] args) {
        exerciseOne(1,2);
        exerciseTwo(30);
        exerciseThree(789);
        exerciseFour(23.358);
        exerciseFive(31,5);
        exerciseSix(10,8);
    }

    public static void exerciseOne(int b,int c) {
        //Напишите приложение, которое будет рассчитывать и выведите значение по формуле:
        //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
        int a=  4*(b+c-1)/2;
        System.out.println("Задание №1"  );
        System.out.println("При значениях b = "+ b+ " и c = " + c + "\n"+
                "Значение а будет = " + a );
    }
    public static void exerciseTwo(int n) {
        //В переменной n сохраняется двузначное число. разработать программу, резервную и
        //выводящую на экран цифру n. Например: n =26, в результате мы должны получить 8 (2+6)
       int n2 = n / 10;
       int n3 = n% 10;
       int sumN = n2+n3;
        System.out.println("Задание №2"  );
        System.out.println("При изначальном значении = " + n + "\n"+
                "Сумма двухзначного числа =  "+ sumN );
    }
    public static void exerciseThree(int n) {
        //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить 9 (1+2+6).
        int n1 = n / 100;
        int n2 = n % 100;
        n2 /=10;
        int n3 = n % 10;
        int sumN =n1 +n2+n3;
        System.out.println("Задание №3"  );
        //System.out.println (n1+" "+n2 + " "+ n3);
        System.out.println("При изначальном значении = " + n + "\n"+
                "Сумма двухзначного числа =  "+ sumN );
    }
    public static void exerciseFour(double n) {
        //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
        //программу, округляющую число n до ближайшего целого и выводящую результат на экран.
        int nInit = (int) n;
        int nPro = (int) (n*10 % 10);
        int newN = (nPro >=5)? nInit+1 : nInit  ;
        System.out.println("Задание №4"  );
        System.out.println("При значениях n = "+ n+ "\n"+
                "Округление = " + newN );
    }
    public static void exerciseFive(int q,int w) {
        //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
        //на экран результат деления q на w с остатком. Пример вывода программы (для случая,
        // когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
        int n = q/w;
        int nPro = q%w ;
        System.out.println("Задание №5"  );
        System.out.println("При значениях q = "+ q+ " и w = " + w +"\n"+
                "При делении q/w = " + n + " остаток = " +nPro);
    }
    public static void exerciseSix(int a,int b) {
        //Написать программу, которая будет менять местами значение целочисленных
        //переменных. Пример:int a = 1; int b = 2;
        //sout(a); //выведет 2 sout(b); //выведет 1
        //   Усовершенствовать программу, использовать только 2 входные переменные (a, b);
        a = a+b;
        b = a-b;
        a=a-b;
        System.out.println("Задание №6"  );
        System.out.println("Новые значения значениях a = "+ a+ " и b = " + b );
    }
}
