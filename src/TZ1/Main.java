package TZ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("-".repeat(70));
            System.out.println("Начать новую игру?" +
                    "\n" + "1  - Да,конечно! " +
                    "\n" + "0  - Не, я пошёл.");
            System.out.println("Ожидаю Вашего ответа");
            int chois = getInput().nextInt();
            System.out.println("-".repeat(70));
            switch (chois) {
                case 1 -> {
                    System.out.println("Эта битва будет легендарна!");
                    setboard();
                }
                case 0 -> {
                    System.out.println("Давай,Дасвиданья!");
                    return;
                }
                default -> System.out.println("Введен не существующий вариант!");
            }

        } while (true);

    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void setboard() {
        String[][] board = setStartboard();
        String ilementPerson, ilementAI;
        boolean personFirst = (Math.random() < 0.5);

        if (personFirst) {
            ilementPerson = "X";
            ilementAI = "0";
            System.out.println("Вы первый!");
        } else {
            ilementPerson = "0";
            ilementAI = "X";
            System.out.println("Первый AI");
        }
        boolean personTurn = personFirst;
        boolean gameOver = false;
        while (!gameOver) {
                 getBord(board);

            if (personTurn) {
                System.out.println("Ваш ход (" + ilementPerson + ")");
                setIlement(board, "Person", ilementPerson);
                if (!checWin(board, ilementPerson)) {
                    System.out.println("Победа за тобой! Ура, держи медальку");
                    gameOver = true;
                }
            } else {
                System.out.println("Ход AI (" + ilementAI + ")");
                setIlement(board, "AI", ilementAI);
                if (!checWin(board, ilementAI)) {
                    System.out.println("Победил AI! Нам срочно нужна Сара Коннер!");
                    gameOver = true;
                }
            }
            if (!gameOver && isBoardFull(board)) {
                System.out.println("Ничья! Все клетки заняты.");
                gameOver = true;
            }
            personTurn = !personTurn;
        }
         getBord(board);
    }

    public static int randomNumber() {
        int t;
        do {
            t = (int) ((Math.random() * 10));
        }
        while (t > 2);
        return t;
    }

    public static void getBord(String[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print((board[row][col] + "\t"));
            }
            System.out.println();
        }
    }

    public static String[][] setIlement(String[][] board, String who, String ilement) {
        int r, c;
        if (who.equals("AI")) {
            r = randomNumber();
            c = randomNumber();
        } else {
            System.out.println("Введите строчку от 0 до 2");
            r = getInput().nextInt();
            System.out.println("Введите столб от 0 до 2");
            c = getInput().nextInt();
        }
        if (board[r][c].equals("-")) {
            board[r][c] = ilement;
            return board;
        } else {
            if (who.equals("Person")) {
                System.out.println("В этом месте уже есть значение");
            }
            setIlement(board, who, ilement);
        }
        return board;
    }
    public static String[][] setNewBord(String[][] board,String ilement) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].equals("-")) {
                    setIlement(board, "AI", ilement);
                    return board;
                }
            }
        }
        return board;
    }
    public static boolean checWin(String[][] board, String ilement) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(ilement) && board[i][1].equals(ilement) && board[i][2].equals(ilement)) {
                return false;
            } else if (board[0][i].equals(ilement) && board[1][i].equals(ilement) && board[2][i].equals(ilement)) {
                return false;
            } else if (board[0][0].equals(ilement) && board[1][1].equals(ilement) && board[2][2].equals(ilement)) {
                return false;
            } else if (board[0][2].equals(ilement) && board[1][1].equals(ilement) && board[2][0].equals(ilement)) {
                return false;
            }
        }
        return true;
    }
    public static String[][] setStartboard() {
        String[][] board = new String[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = "-";
            }
        }
        System.out.println("-".repeat(50));
        return board;
    }
    public static boolean isBoardFull(String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
}