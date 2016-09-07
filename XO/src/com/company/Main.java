package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String playerName = new String();
        System.out.println("Hello user this is game XO");
        playerName = howName();
        Game game = new Game(playerName);
        Field field=new Field();
        game.startGame(field);
        game.endGame(field);

        field.showField();
        System.out.println();
        System.out.println(" Good Bay!");




    }
    private static String howName() throws IOException {
        String str = new String();
        System.out.println("What is your name? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
           str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
