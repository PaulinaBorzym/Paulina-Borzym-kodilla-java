package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> number = new ArrayList<>();

    public SudokuRow() {
        for (int n = 0; n < 9; n++){}
       //     number.add(-1);
    }
    @Override
    public String toString(){
        String s = "|";
        for(int n = 0; n<number.size(); n++) {}
          //  s += " " + number.getNumber + " |";
            s += "\n";
            return s;

    }
}
