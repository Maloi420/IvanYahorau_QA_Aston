public class ArraySumCalculator {
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // Тестовый массив
        String[][] array = {
                {"3", "223114", "3213", "422"},
                {"54", "26", "41237", "8221"},
                {"92", "110", "211", "13132"},
                {"132", "14214", "125", "132"}
        };

        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}