import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Example3 {

    public static void inputArray(int[] array) {
        try {
            Scanner console = new Scanner(System.in);
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter the numbers of the array:");
                array[i] = console.nextInt();
            }
            System.out.print("Array output: ");
            System.out.println(Arrays.toString(array));
        } catch (InputMismatchException inputArray) {
            System.out.println("Not numbers entered !");
        }
    }

    public static void evenAndOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                array[i] *= 2;
                System.out.print("Even number multiplied by 2: ");
                System.out.println(array[i]);
            } else {
                double result = (double) 1 / array[i];
                System.out.print("Inverse odd number: ");
                System.out.println(result);
            }
        }
    }

    public static void inputMas(int [] mas){
        try {
            Scanner console = new Scanner(System.in);
            for (int i = 0; i < mas.length; i++) {
                System.out.println("Enter the numbers of the mas:");
                mas[i] = console.nextInt();
            }
            System.out.print("Mas output: ");
            System.out.println(Arrays.toString(mas));
        } catch (InputMismatchException inputMas) {
            System.out.println("Not numbers entered !");
        }
    }

    public static void numberOfElements(int [] mas){
        int count = 0;
        for (int m : mas) {
            if (m < 7) {
                count++;
            }
        }
        System.out.println("The number of elements is less than 7: " + count );
    }

    public static void sumOfElements(int [] mas){
        int firstElement = 0;
        int lastElement = 0;
        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                firstElement = mas[i];
                index1 = i;
                break;
            }
        }
        for (int j = 0; j < mas.length; j++){
            if (mas[j] > 0){
                lastElement = mas[j];
                index2 = j;
            }
        }

        for (int k = index1; k <= index2; k++) {
          //  if (mas[k] > index1 && mas[k] < index2) {
                sum += mas[k];
           // }
        }
        System.out.println("The first positive element: " + firstElement + " " + "index = " + index1);
        System.out.println("The last positive element: " + lastElement + " " + "index = " + index2);
        System.out.println("Sum elements: " + sum);
    }

    public static void inputRandomMas(int [] randomMas){
        try {
            for (int i = 0; i < randomMas.length; i++) {
            randomMas[i] = (int) (Math.random() * 200) - 100 + 1;
            }
            System.out.print("Mas output: ");
            System.out.println(Arrays.toString(randomMas));
        } catch (InputMismatchException inputRandomMas) {
            System.out.println("Not numbers entered !");
        }
    }

    public static void numberOfElements1(int [] randomMas){
        int count = 0;
        for (int m : randomMas) {
            if (m < 7) {
                count++;
            }
        }
        System.out.println("The number of elements is less than 7: " + count );
    }

    public static void sumOfElements1 (int [] randomMas){
        int firstElement1 = 0;
        int lastElement1 = 0;
        int index1 = 0;
        int index2 = 0;
        int sum = 0;
        for (int i = 0; i < randomMas.length; i++) {
            if (randomMas[i] > 0) {
                firstElement1 = randomMas[i];
                index1 = i;
                break;
            }
        }
        for (int j = 0; j < randomMas.length; j++){
            if (randomMas[j] > 0){
                lastElement1 = randomMas[j];
                index2 = j;
            }
        }

        for (int k = index1; k <= index2; k++) {
            sum += randomMas[k];
        }
        System.out.println("The first positive element: " + firstElement1 + " " + "index = " + index1);
        System.out.println("The last positive element: " + lastElement1 + " " + "index = " + index2);
        System.out.println("Sum elements: " + sum);
    }



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("0 - exit");
            System.out.println("1 - task 1");
            System.out.println("2 - task 2");
            System.out.println("3 - task 2(random)");
            int taskNumber = console.nextInt();

            if (taskNumber == 1) {
                try {
                    System.out.println("Enter the size of the array:");
                    int arrayLength = console.nextInt();
                    int[] array = new int[arrayLength];
                    inputArray(array);
                    evenAndOddNumbers(array);
                } catch (InputMismatchException arrayLength) {
                    System.out.println("Not a number entered !");
                }

            } else if (taskNumber == 2) {
                try {
                    System.out.println("Enter the size of the array:");
                    int masLength = console.nextInt();
                    int[] mas = new int[masLength];
                    inputMas(mas);
                    numberOfElements(mas);
                    sumOfElements(mas);
                } catch (InputMismatchException masLength) {
                    System.out.println("Not a number entered !");
                }

            } else if (taskNumber == 3) {
                try {
                    System.out.println("Enter the size of the array:");
                    int randomMasLength = console.nextInt();
                    int[] randomMas = new int[randomMasLength];
                    inputRandomMas(randomMas);
                    numberOfElements1(randomMas);
                    sumOfElements1(randomMas);

                } catch (InputMismatchException randomMasLength) {
                    System.out.println("Not a number entered !");

                }
            }  else if (taskNumber == 0) {
                    break;
                }
            }

        }
    }
