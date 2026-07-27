package homework11;

public class Main{
    public static void main(String [] args) {
       JobString js = new JobString();
        do {
            System.out.println("-".repeat(70));
            System.out.println("Добрый день, задайте три строчки - ");
            String [] arrayString= js.getArrayString();
            System.out.println("Я хочу выполнить со строчками - " +
                    "\n" + "1  - Найти максимальную и минимальную строчку " +
                    "\n" + "2  - Упорядочить от большей к меньшей"+
                    "\n" + "3  - Найти строчки меньше средней" +
                    "\n" + "4  - Найти уникальную строчку без повтора символов" +
                    "\n" + "5  - Задублировать каждый символ строчки " +
                    "\n" + "0  - Уйти из зоопарка");
            int chois= SetStringUser.getInt();
            System.out.println("-".repeat(70));

            switch (chois){
                case 1 -> js.getMaxAndMinString(arrayString);
                case 2 -> js.getMeanValue(arrayString,js.getMaxAndMinString(arrayString),2);
                case 3 -> js.getMeanValue(arrayString,js.getMaxAndMinString(arrayString),3);
                case 4 -> js.getVariousSymbols(arrayString);
                case 5 -> js.dobleString();
                case 0 -> {return;}
                default ->  System.out.println("Такой цифры я не знаю!");
            }
        } while (true);
    }
}

