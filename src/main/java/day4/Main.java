package day4;

import utils.DataType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GridDataProvider gridDataProvider = new GridDataProvider();
        try {
            gridDataProvider.loadData(DataType.PUZZLE_INPUT);
        } catch (IOException e) {
            System.err.println("Could not load puzzle input.");
            return;
        }
        var result = WordCounter.count(gridDataProvider.getSoughtWord(), gridDataProvider.getGrid());
        var xResult = WordCounter.countXShaped(gridDataProvider.getSoughtXWord(), gridDataProvider.getGrid());
        System.out.println(
                "There are " + result + " " + gridDataProvider.getSoughtWord() + "es and " + xResult + " X shaped " +
                        gridDataProvider.getSoughtXWord() + "es!"
        );
    }
}
