
import java.util.Scanner;

public class Example1 {

    public static void functionCalculation1(double x) {
        if (x <= 2) {
            double function1 = Math.pow(x, 2) + 5 * x - 6;
            System.out.println(function1);
        } else {
            double function2 = Math.abs(x + Math.cos(x));
            System.out.println(function2);
        }

    }

    public static void functionCalculation2(double x) {
        if (x <= 2) {
            double function1 = Math.pow(x, 2) + 5 * x - 6;
            System.out.println(function1);
        }
        if (x > 2) {
            double function2 = Math.abs(x + Math.cos(x));
            System.out.println(function2);
        }
    }

    public static void typeOfTriangle(double rightSide, double leftSide, double base) {
        if (rightSide <= 0 || leftSide <= 0 || base <= 0) {
            System.out.println("Incorrectly entered data !");
        } else if (rightSide + leftSide < base || rightSide + base < leftSide || leftSide + base < rightSide) {
            System.out.println("Impossible to create a triangle.");

        } else if (rightSide == leftSide && rightSide != base && leftSide != base) {
            System.out.println("Triangle is isosceles.");

        } else if (rightSide == leftSide && rightSide == base && leftSide == base) {
            System.out.println("Triangle is equilateral.");
        } else {
            System.out.println("Triangle is scalene.");
        }
    }

    public static void nameOfNumbers(int number) {
        switch (number) {
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("The number is outside the allowable values.");
                break;
        }
    }

    public static void functionCalculation3(double x1, int y, int z)  throws ArithmeticException{
            try {
                double function3 = (Math.log(((1 - y) / (1 + x1)) + z) / Math.log(2));
                System.out.println(function3);
                if (Double.isNaN(function3) || Double.isInfinite(function3)) {
                    throw new ArithmeticException("Illegal values !");
                }
            } catch (ArithmeticException function3) {
                System.out.println("Division by zero.");
            }

            }

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                Scanner console = new Scanner(System.in);
        while (true){
            System.out.println("0 - exit");
            System.out.println("1 - task 1");
            System.out.println("2 - task 2");
            System.out.println("3 - task 3");
            System.out.println("4 - task 4");
            int taskNumber = scan.nextInt();

            if (taskNumber == 1){
                System.out.println("Task 1:");
                System.out.println("Input the number:");
                double x = console.nextDouble();
                functionCalculation1 (x);
                functionCalculation2(x);

            }
            if (taskNumber == 2){
                System.out.println("Task 2:");
                System.out.println("Input the right side of the triangle:");
                double rightSide = console.nextDouble();
                System.out.println("Input the left side of the triangle:");
                double leftSide = console.nextDouble();
                System.out.println("Input the base of the triangle:");
                double base = console.nextDouble();
                typeOfTriangle(rightSide,leftSide,base);
            }

            if (taskNumber == 3){

                System.out.println("Task 3:");
                System.out.println("Input number from 10 to 20:");
                int number = console.nextInt();
                nameOfNumbers(number);

            }
            if (taskNumber == 4){
                System.out.println("Task 4:");
                System.out.println("Input whole x:");
                double x1 = console.nextDouble();
                System.out.println("Input whole y:");
                int y = console.nextInt();
                System.out.println("Input whole z:");
                int z = console.nextInt();
                functionCalculation3(x1,y,z);
            }

            if (taskNumber == 0){
                break;
            }

        }

    }
}
