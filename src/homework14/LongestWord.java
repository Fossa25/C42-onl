package homework14;

import java.io.*;

public class LongestWord {
   public static void getLongestWord(String inputFile,String outputFile){
    String longestWord = "";
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("[^a-zA-Z']+");
            for (String word : words) {
                if (!word.isEmpty() && word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("Файл не найден!");
    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());
    }
        try (BufferedWriter pw = new BufferedWriter(new FileWriter(outputFile) )) {
        pw.write("OGO! Вот оно слово моей мечты это же : " + longestWord);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
