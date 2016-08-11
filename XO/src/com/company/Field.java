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
    public void setCell(int x, int y,char c){
        this.field[x][y]=c;
    }
    public void newField(Field obj){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                obj.field[j][i] = '*';
            }
        }
        System.out.println("Field ready. Let's go!");
    }
    public  void showField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(this.field[j][i]);
            }
            System.out.println();
        }
    }
    public boolean checkFreeCell(){
        boolean freeCell = false;
        for (int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                if (this.field[i][j] == '*') {
                    freeCell = true;
                    break;
                }
            }

        }
        return freeCell;
    }
    public char checkWin() {
        char win = '!';
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != '*') {
                win = field[i][0];
                break;
            }
        }
        if (win == '!') {
            for (int i = 0; i < 3; i++) {
                if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != '*') {
                    win = field[0][i];
                    break;
                }
            }
        }
        if (win == '!') {
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != '*') {
                win = field[0][0];
            }
        }
        if (win == '!') {
            if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != '*') {
                win = field[0][2];
            }
        }
        return win;}
    }
