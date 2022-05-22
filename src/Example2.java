import java.util.Scanner;

public class Example2 {

    public static void functionCalculation(int x, int y) {
        Scanner console = new Scanner(System.in);

        double function = ((x + y) / (Math.pow(x, 2) - x * y + Math.pow(y, 2))) + (Math.sin(x) / (1 - Math.pow(y, 2))) + (Math.cos(y) / (1 - Math.pow(x, 2)));
        boolean check = true;
        while (check) {
            if (Double.isNaN(function) || Double.isInfinite(function)) {

                System.out.println("Invalid values:");
                System.out.println("Enter again:");
                System.out.println("Input x:");
                x = console.nextInt();
                System.out.println("Input y:");
                y = console.nextInt();
                function = ((x + y) / (Math.pow(x, 2) - x * y + Math.pow(y, 2))) + (Math.sin(x) / (1 - Math.pow(y, 2))) + (Math.cos(y) / (1 - Math.pow(x, 2)));

            } else {
                System.out.println(function);
                check = false;
            }
        }
    }

    public static void multiplicationOfEvenNumbers1(int number){
     if (number < 10 || number > 50){
         System.out.println("Invalid values:");
     } else {
         long product = 1;
         for (int i = number; i <= 50; i++){
             if (i > number && (i % 2) == 0){
                product *= i;
             }
         }
         System.out.println(product);

     }

    }

    public static void multiplicationOfEvenNumbers2(int number) {
        if (number < 10 || number > 50) {
            System.out.println("Invalid values:");
        } else {
            long product = 1;
            int i = number;
            while (i <= 50){
                if (i > number && (i % 2) == 0){
                    product *= i;
                }
                i++;
            }
            System.out.println(product);
        }
    }

    public static void multiplicationOfEvenNumbers3(int number) {
        if (number < 10 || number > 50) {
            System.out.println("Invalid values:");
        } else {
            long product = 1;
            int i = number;
            do {
                if (i > number && (i % 2) == 0 )
                    product *= i;
                    i++;
                }
                while (i <= 50 ) ;
                System.out.println(product);
            }
        }

        public static double Sum(int i, int j){
            return (double) i/j;
        }




        public static void tabFunction(double leftLimit, double rightLimit, double step) throws ArithmeticException {
                System.out.println("x" + "                    " + "y = f(x)");
                for (double x = leftLimit; x <= rightLimit; x += step) {
                    double function = Math.cbrt(x) + Math.log10(3 * x);
                    System.out.println(x + "              " + function);
                    if (Double.isNaN(function) || Double.isInfinite(function)) {
                        throw new ArithmeticException("Illegal values");
                    }
                }

            }

    public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    while (true){
        System.out.println("0 - exit");
        System.out.println("1 - task 1");
        System.out.println("2 - task 2 (for)");
        System.out.println("3 - task 2 (while)");
        System.out.println("4 - task 2 (do while)");
        System.out.println("5 - task 3");
        System.out.println("6 - task 4");
        System.out.println("Input number of task:");
        int taskNumber = console.nextInt();


            if (taskNumber == 1){
                System.out.println("Function: ((x + y) / (x^2 - x * y + y^2)) + (sin(x) / (1 - y^2)) + (cos(y) / (1 - x^2));");
            System.out.println("Input x:");
            int x = console.nextInt();
            System.out.println("Input y:");
            int y = console.nextInt();
            functionCalculation(x,y);

           } else if (taskNumber == 2){
                System.out.println("Input number in the range from 10 to 50");
                int number = console.nextInt();
                multiplicationOfEvenNumbers1(number);

           } else if (taskNumber == 3) {
                System.out.println("Input number in the range from 10 to 50");
                int number = console.nextInt();
                multiplicationOfEvenNumbers2(number);

            } else if (taskNumber == 4){
                System.out.println("Input number in the range from 10 to 50");
                int number = console.nextInt();
                multiplicationOfEvenNumbers3(number);

            } else if (taskNumber == 5) {
                double sum = 0;
                for (int i = 1; i <= 20; i++){
                    for (int j = i; j <= 30; j++){
                       sum += Sum(i,j);
                    }
                }
                System.out.println("Sum function = " + sum);

            } else if (taskNumber == 6){
                double leftLimit = 1.25;
                double rightLimit = 6.75;
                double step = 0.25;
                tabFunction(leftLimit,rightLimit,step);

            } else if (taskNumber == 0){
                break;
        }
    }
    }
}
