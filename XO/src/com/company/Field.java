package com.company;

/**
 * Created by user2 on 11.08.2016.
 */
public class Field {
    private char [][] field = new char[3][3];

    public Field() {
        newField(this);

    }

    public char[][] getField() {
        return field;
    }

    public void setField(char[][] field) {
        this.field = field;
    }
    public void newField(Field obj){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                obj.field[j][i] = '*';
            }
        }
        System.out.println("Field ready. Let's go!");
    }
}
