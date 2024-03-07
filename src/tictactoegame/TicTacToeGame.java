/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoegame;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author jason
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[][] boardgameentries = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}

        };

        displayBoard(boardgameentries);

        boolean PlayGame = true;

        while (PlayGame) {

            int computerRandom = (int) (Math.random() * 9) + 0;
            System.out.println("Select the Position of where you want to place your letter. Pick from 1 - 9");
            System.out.println("The computer picked: " + computerRandom);
            Scanner scan = new Scanner(System.in);

            int userOption = scan.nextInt();
            System.out.println();
            PlaceUserPosition(userOption, boardgameentries, computerRandom);
            System.out.println();
            FindWinner(boardgameentries, PlayGame);

            System.out.println("To quit press Q, otherwise press any button to continue.");
            String ContinueorNot = scan.next();

            if ("q".equals(ContinueorNot) || "Q".equals(ContinueorNot)) {
                PlayGame = false;
            }
        }

    }

    static void FindWinner(char[][] boardGame, boolean FinishGame) {

        if (boardGame[0][0] == 'x' && boardGame[0][1] == 'x' && boardGame[0][2] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        if (boardGame[1][0] == 'x' && boardGame[1][1] == 'x' && boardGame[1][2] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        if (boardGame[2][0] == 'x' && boardGame[2][1] == 'x' && boardGame[2][2] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        if (boardGame[0][0] == 'x' && boardGame[1][0] == 'x' && boardGame[2][0] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        if (boardGame[1][1] == 'x' && boardGame[1][1] == 'x' && boardGame[1][1] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        if (boardGame[0][2] == 'x' && boardGame[1][2] == 'x' && boardGame[2][2] == 'x') {
            System.out.println("User wins!");
            FinishGame = false;
        }

        // computer 
        if (boardGame[0][0] == 'o' && boardGame[0][1] == 'o' && boardGame[0][2] == 'o') {
            System.out.println("Computer wins!");
            FinishGame = false;
        }
        if (boardGame[1][0] == 'o' && boardGame[1][1] == 'o' && boardGame[1][2] == 'o') {
            System.out.println("Computer wins!");
            FinishGame = false;
        }
        if (boardGame[2][0] == 'o' && boardGame[2][1] == 'o' && boardGame[2][2] == 'o') {
            System.out.println("Computer wins!");
            FinishGame = false;
        }

        if (boardGame[0][0] == 'o' && boardGame[1][0] == 'o' && boardGame[2][0] == 'o') {
            System.out.println("computer wins!");
            FinishGame = false;
        }

        if (boardGame[1][1] == 'o' && boardGame[1][1] == 'o' && boardGame[1][1] == 'o') {
            System.out.println("computer wins!");
            FinishGame = false;
        }

        if (boardGame[0][2] == 'o' && boardGame[1][2] == 'o' && boardGame[2][2] == 'o') {
            System.out.println("computer wins!");
            FinishGame = false;
        }

    }

    static void PlaceUserPosition(int userPlace, char[][] theboard, int computerRandom) {

        int countPosition = 0;
        if (computerRandom == userPlace) {
            computerRandom = (int) Math.random() * 8;
        }
        for (int t = 0; t < theboard.length; t++) {

            for (int d = 0; d < theboard[t].length; d++) {

                if (computerRandom == userPlace) {
                    computerRandom = (int) Math.random() * 8;
                } else {
                    if (countPosition == computerRandom) {
                        theboard[t][d] = 'o';
                    }
                }
                if (countPosition == userPlace) {
                    theboard[t][d] = 'x';
                }

                //  theboard[t][d] ;
                countPosition++;
            }

        }
        displayBoard(theboard);

    }

    // Display the board
    static void displayBoard(char[][] theboard) {

        for (int t = 0; t < theboard.length; t++) {
            System.out.print("| ");
            for (int d = 0; d < theboard[t].length; d++) {

                System.out.print(String.valueOf(theboard[t][d]) + " | ");
            }
            System.out.println();
            for (int j = 0; j < 4; j++) {

                System.out.print(" - ");
            }

            System.out.println();
        }
    }

}
