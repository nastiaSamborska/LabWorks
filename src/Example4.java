import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {

    public static void inputArray (int[][] array) {
        try {
            System.out.println("Input array:");
            Scanner console = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = console.nextInt();
                }
            }
        } catch (InputMismatchException inputArray) {
            System.out.println("Not numbers entered !");

        }
    }

    public static void outputArray (int[][] array){
        System.out.println("Output array:");
        for (int[] rows : array) {
            for (int value : rows)
                System.out.print(value + " ");
                System.out.println();
        }
    }

    public static void geometricMean (int[][] array, int count) throws ArithmeticException {
        System.out.println("The total number of elements in the array: " + count);
        long product = 1;
        for (int[] rows : array) {
            for (int value : rows) {
                product *= value;
            }
        }
        System.out.println("Product of elements: " + product);
        double geometricMean = Math.pow(product, (double) 1 / count);
        if (Double.isNaN(geometricMean)) {
            throw new ArithmeticException("Illegal values (NaN)!");
        } else {
            System.out.println("Geometric mean: " + geometricMean);
        }

    }

    public static void inputMas(int [][] mas){
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                mas[i][j] = (int) (Math.random() * (200+1)) - 100;
            }
        }
    }

    public static void outputMas(int [][] mas){
        for(int[]rows : mas){
            for (int value : rows) {
                System.out.print(value + "  ");

            }
            System.out.println();
        }
    }

    public static void searchMaxElement (int [][] mas){
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < mas.length; i++){
            for (int j = mas.length - 1; j > mas.length - i - 1; j--){
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }

            }

        }
        System.out.println("Max element: " + max);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        while (true){
            System.out.println("0 - exit");
            System.out.println("1 - task 1");
            System.out.println("2 - task 2");
            int taskNumber = console.nextInt();

            if (taskNumber == 1) {
                try {
                    System.out.println("Enter the number of rows:");
                    int numberOfRows = console.nextInt();
                    System.out.println("Enter the number of columns");
                    int numberOfColumns = console.nextInt();
                    int[][] array = new int[numberOfRows][numberOfColumns];
                    int count = numberOfColumns * numberOfRows;
                    inputArray(array);
                    outputArray(array);
                    geometricMean(array, count);
                } catch (NegativeArraySizeException numberOfRows) {
                    System.out.println("Negative size");
                }
            } else if (taskNumber == 2){
                System.out.println("Enter the dimension of the matrix:");
                int masLength = console.nextInt();
                int[][] mas = new int[masLength][masLength];
                inputMas(mas);
                outputMas(mas);
                searchMaxElement(mas);
            } else if (taskNumber == 0){
                break;
            }

        }
    }
            }



