package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private final List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int n = 0; n < 3; n++)
            rows.add(new SudokuRow());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("|---|---|---|\n");
        for (SudokuRow sudokuRow : rows) {
            s.append(sudokuRow.toString());
        }
        s.append("|---|---|---|\n");
        return s.toString();
    }
}
