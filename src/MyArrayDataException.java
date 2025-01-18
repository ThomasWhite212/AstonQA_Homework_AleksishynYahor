public class MyArrayDataException extends Exception {
    private int row;
    private int column;

    public MyArrayDataException(String message, int row, int column) {
        super(message);
        this.row = row;
        this.column = column;
    }

    public String getDetails() {
        return "Ошибка в ячейке [" + row + "][" + column + "]: " + getMessage();
    }
}