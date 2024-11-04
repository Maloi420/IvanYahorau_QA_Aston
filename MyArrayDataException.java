class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super("Некорректные данные в ячейке [" + row + "][" + col + "]. Ожидалось целое число.");
    }
}