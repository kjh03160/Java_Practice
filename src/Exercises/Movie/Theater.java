package Exercises.Movie;

public class Theater {
    private Seat[][] seats;

    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }
        seats = new Seat[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        int rowIndex = getRowIndex(rowChar);
        if (rowIndex > rowCount || rowIndex < 0){
            return false;
        }

        for (int i = 0; i < numSeat; i++){
            try {
                Seat temp = seats[rowIndex][col + i - 1];
                if (temp.getName() != null){
                    return false;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                return false;
            }
        }
        for (int i = 0; i < numSeat; i++) {
            seats[rowIndex][i + col - 1].reserve(name);
        }
        return true;
    }

    public int cancel(String name) {
        int count = 0;
        for (int i = 0; i < rowCount; i++){
            for (int j = 0; j < colCount; j++){
                if (seats[i][j].isOccupied() && seats[i][j].getName().equals(name)){
                    seats[i][j].cancel();
                    count++;
                }
            }
        }
        return count;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        if (numSeat > colCount){
            numSeat = colCount;
        }
        int canceledSeats = 0;
        for (int j = 0; j < numSeat; j++) {
            if (seats[getRowIndex(rowChar)][col + j - 1].isOccupied()){
                canceledSeats++;
                seats[getRowIndex(rowChar)][col + j - 1].cancel();
            }
        }
        return canceledSeats;
    }


    public int getNumberOfReservedSeat() {
        int count = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (seats[i][j].isOccupied()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}