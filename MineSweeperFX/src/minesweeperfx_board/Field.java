/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperfx_board;

/**
 *
 * @author lukas
 */
public class Field {
    private final int x;
    private final int y;
    private final Mark mark;

    public Field(int x, int y, Mark mark) {
        this.x = x;
        this.y = y;
        this.mark = mark;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Mark getMark() {
        return mark;
    }
    
    
    
}
