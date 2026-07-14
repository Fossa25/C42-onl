package homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public final String[] eatHerbivores = {"Сеном","Яблоком","Морковкой"};
    public final String[] eatCarnivores = {"Мясом","Рыбой","Костью"};

    public void zonaDog(){
        Animal dog = new Dog("Собака","Bob",3,8,"men");
        goZona(dog);
    }
    public void zonaTiger(){
        Animal tiger = new Tiger("Тигр","Alex",8,100,"men");
        goZona(tiger);
    }
    public void zonaRabbit(){
        Animal rabbit = new Rabbit("Кролик","Plby",10,2,"women");
        goZona(rabbit);
    }

    public void goZona(Animal animal){
        tibel();
        System.out.println(animal);
        System.out.println("-".repeat(40));
        sethear();
        animal.vois();
        setEat();
        animal.eat(getInput().nextLine());
        System.out.println("-".repeat(50));
    }

    public void tibel(){
        System.out.println("Ты подходишь к табличке и читаешь информацию: ");
        System.out.println("-".repeat(40));
    }
    public void sethear(){
        System.out.println("А дальше слышишь: ");
    }

    public void setEat(){
        System.out.println("Можно его покормить " + Arrays.toString(eatHerbivores) +" или " + Arrays.toString(eatCarnivores));
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}
