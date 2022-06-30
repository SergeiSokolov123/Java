package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
     char[][] symbol = new char[size][size];
     for (int i = 0; i < symbol.length ; i++){
         for (int j = 0; j < symbol.length ; j++){
     symbol[i][j] = ' ';
         }}
     for (int i = 0 ; i < size; i ++){
         symbol[i][i] = SYMBOL;
         symbol[(size-1)-i][i] = SYMBOL;
     }
        return symbol;

    }
}
