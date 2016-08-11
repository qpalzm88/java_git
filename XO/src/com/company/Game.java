package com.company;

import java.util.Scanner;

/**
 * Created by user2 on 11.08.2016.
 */
public class Game {
    private String playerName;
    public static final Scanner scanner = new Scanner(System.in);

    public Game(String playerName) {
        this.playerName = playerName;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private void step(Field field) {
        boolean nextStep = false;
        System.out.print("Your step " + this.getPlayerName());
        while (!nextStep) {
            int[] i = this.scanStep();
            int x = --i[0];
            int y = --i[1];
            char[][] pole = new char[3][3];
            pole = field.getField();
            if (pole[x][y] != '0' || pole[x][y] != 'X') {
                field.setCell(x, y, 'X');
                nextStep = true;
            } else {
                System.out.println(" this is cell no empty");
            }
        }


    }

    private int[] scanStep() {
        int[] ints = new int[2];
        while (true)
            try {

                do {
                    System.out.println("Please enter horizontal number field  from 1 until 3 ");
                    ints[0] = Integer.valueOf(scanner.next());
                }
                while (ints[0] < 1 || ints[0] > 3);
                do {
                    System.out.println("Please enter vertical number field  from 1 until 3 ");
                    ints[1] = Integer.valueOf(scanner.next());
                }
                while (ints[1] < 1 || ints[1] > 3);
                break;

            } catch (Exception e) {
                System.out.println("wrong");
            }
        return ints;

    }

    public void startGame(Field field) {

        while (true) {
            field.showField();
            this.step(field);
            if (field.checkWin()!='!'|| !field.checkFreeCell()){
                break;
            }
            field.showField();
            Computer.step(field);
            if (field.checkWin()!='!'|| !field.checkFreeCell()){
                break;
            }



        }
    }
    public void endGame(Field field){
        char win = field.checkWin();
        if (   win == 'X') {
            System.out.println(" You Win");
        }
        if (win == '0') {
            System.out.println(" Computer Win");
        }
        if (win == '!' && !field.checkFreeCell()) {
            System.out.println("Draw");
        }

    }
}
