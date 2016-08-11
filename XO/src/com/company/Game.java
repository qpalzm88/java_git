package com.company;

import java.util.Scanner;

/**
 * Created by user2 on 11.08.2016.
 */
public class Game {
    private String playerName;
    private Scanner scanner;

    public Game(String playerName) {
        this.playerName = playerName;
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println(". Please enter horizontal number field  from 1 until 3 ");
                    ints[0] = Integer.valueOf(scanner.next());
                }
                while (ints[0] < 1 || ints[0] > 3);
                do {
                    System.out.println(". Please enter vertical number field  from 1 until 3 ");
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



        }
    }
}
