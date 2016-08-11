package com.company;

import java.util.Random;

/**
 * Created by user2 on 11.08.2016.
 */
public class Computer {
    public static void step(Field field){
        Random random = new Random();
        System.out.println("Now step Computer");
        int x = random.nextInt(3);
        int y = random.nextInt(3);
        char [][] ch =new char[3][3];
        ch=field.getField();
        while (ch[x][y] == '0' || ch[x][y] == 'X') {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        field.setCell(x,y,'0');
    }

}
