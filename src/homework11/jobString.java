package homework11;

import java.util.Arrays;

public class jobString extends setStringUser {


    public String[] getArrayString() {
        String[] arrayString = new String[3];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Введите строчку № " + (i + 1));
            arrayString[i] = getInput();
        }
        System.out.println(Arrays.toString(arrayString));
        return arrayString;
    }

    public String [] getMaxAndMinString(String[] arrayString) {

        int minLongInt = 10000;
        int maxLongInt = 0;
        String minLongString = "";
        String maxLongString = "";

        for (String s : arrayString) {
            if (minLongInt > s.length()) {
                minLongInt = s.length();
                minLongString = s;
            }
            if (maxLongInt < s.length()) {
                maxLongInt = s.length();
                maxLongString = s;
            }
        }
        System.out.println("Min = " + minLongInt + " " + minLongString);
        System.out.println("Max = " + maxLongInt + " " + maxLongString);
        return new String[]{String.valueOf(maxLongInt), String.valueOf(minLongInt)};
    }

    public void getMeanValue(String[] arrayString,String [] arrayMaxAndMin) {
        int maxLongInt= Integer.parseInt(arrayMaxAndMin[1]);
        int minLongInt= Integer.parseInt(arrayMaxAndMin[2]);
        int meanValueLongInt = 0;
        String meanValueLongString = "";
        for (String s : arrayString) {
            if (minLongInt < s.length() && maxLongInt > s.length()) {
                meanValueLongInt = s.length();
                meanValueLongString = s;
            }
        }
        System.out.println("MeanValue = " + meanValueLongInt + " " + meanValueLongString);
        for (String s : arrayString) {
            if (meanValueLongInt > s.length()) {
                System.out.println("Меньше средней - " + s + "\nДлина строки = " + s.length());
            }
        }
    }
    public void getVariousSymbols(String[] arrayString){
        boolean uniqueString =false;
        for (String  s : arrayString) {
            for(int i = 0; i< s.length(); i++){
                for (int x =i+1; x< s.length(); x++ ) {
                    if (s.toLowerCase().charAt(i) != (s.toLowerCase().charAt(x))) {
                        uniqueString = false;
                    } else {
                        uniqueString = true;
                        break;
                    }
                }
                if(uniqueString){break;}
            }
            System.out.println("-".repeat(50));
            System.out.println(uniqueString);
            if(!uniqueString){
                System.out.println(s);
                break;
            }
        }
    }
    public static void dobleString(){
      String userString =getInput();
      String newString="";
       for(int i = 0; i< userString.length(); i++){
          newString= newString + userString.charAt(i) + userString.charAt(i);
       }
       System.out.println(newString);
    }
}



