
import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int cols = 3;
    static int rows = 3;
    public static void drawGame(String[] game) {
        // only draws the game
//        String[][] gameArray = new String[3][3];
        System.out.println("---------");
        for (int i = 0; i < cols; i++) {
            System.out.print("| ");
            for (int j = 0; j < rows; j++){
//                gameArray[i][j] = game[j + i * 3];
                System.out.print(game[j + ( i * 3 )] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
//        return gameArray;

    }
    public static String result(String[] game) {
        int[][] posibilities = {
            {0,1,2}, {3,4,5}, {6,7,8},
            {0,3,6}, {1,4,7}, {2,5,8},
            {0,4,8}, {2, 4, 6}
        };
        // check the winnmer for every posibilitie
        boolean notFinished = false;
        boolean xwon = false;
        boolean owon = false;
        int xTimes = 0;
        int oTimes = 0;
        for (int k = 0; k < game.length; k++) {
            if (Objects.equals(game[k], "O")) {
                oTimes++;
            } else if (Objects.equals(game[k], "X")) {
                xTimes++;
            }
        }
        for (int i = 0; i < posibilities.length; i++) {
            int ogame = 0;
            int xgame = 0;
            for (int j = 0; j < posibilities[i].length; j++) {
                if (Objects.equals(game[posibilities[i][j]], "X")) {
                    xgame += 1;
                    System.out.println("xgame " + xgame);
                } else if (Objects.equals(game[posibilities[i][j]], "O")) {
                    ogame += 1;
                    System.out.println("ogame " + ogame);
                } else if (Objects.equals(game[posibilities[i][j]], " ")) {
                    notFinished = true;
                }
            }
            if (ogame == 3) {
                owon = true;
            }
            if (xgame == 3) {
                xwon = true;
            }
        }
        if (Math.abs(xTimes - oTimes) > 1) {
            return "Impossible";
        }
        if (owon && xwon) {

        } else if (owon) {
            return "O wins";
        } else if (xwon) {
            return "X wins";
        }
        if (notFinished) {
//            return "Game not finished";
            return "Continue";
        }
        return "Draw";
    }


   public static boolean checkForNumber(String xPoss, String yPoss) {
        try {
            Integer.parseInt(xPoss);
            Integer.parseInt(yPoss);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Yoy should enter numbers!");
            return false;
            }
        }

    public static String[] move(String[] game, String x, String y, String turn) {
        boolean validated = false;
        while (!validated) {
            if (checkForNumber(x, y)) {
                validated = checkForNumber(x, y);
                if (validated) {
                    int xCoord = Integer.parseInt(x);
                    int yCoord = Integer.parseInt(y);


                    if (xCoord <= 3 && yCoord <= 3 && xCoord >= 1 && yCoord >= 1) {
                        String poss = game[(xCoord - 1) * 3 + (yCoord - 1)];
                        if (Objects.equals(poss, " ")) {
                            break;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                            validated = false;
                            System.out.print("Enter the coordinates");
                            x = scanner.next();
                            y = scanner.next();
                        }
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                        validated = false;
                        System.out.print("Enter the coordinates");
                        x = scanner.next();
                        y = scanner.next();
                    }
                } else {
                    validated = false;
                    System.out.print("Enter the coordinates");
                    x = scanner.next();
                    y = scanner.next();
                }
            }
        }

        game[(Integer.parseInt(x) - 1) * 3 + (Integer.parseInt(y) - 1)] = turn;
        return game;
    }

    public static void main(String[] args) {
        String[] gameArr = new String[9];
        boolean finished = false;
        String turn = "X";
        for (int i = 0; i < 9; i++) {
            gameArr[i] = " ";
        }
        while (!finished) {
            drawGame(gameArr);
            System.out.print("Enter the coordinates");
            gameArr = move(gameArr, scanner.next(), scanner.next(), turn);
            drawGame(gameArr);
            if (result(gameArr) == "Continue") {
                turn = (Objects.equals(turn, "X")) ? "O" : "X";
            } else {
                finished = true;
                System.out.println(result(gameArr));
            }
        }
    }
}
