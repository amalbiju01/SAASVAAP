import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the operation: \n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
        int operation = input.nextInt();
        int res;
        switch (operation) {
            case 1:
                res=num1+num2;
                System.out.println("Addition: "+res);
                break;

            case 2:
                res=num1-num2;
                System.out.println("Substraction: "+res);
                break;

            case 3:
                res=num1*num2;
                System.out.println("Multiplication: "+res);
                break;

            case 4:
                res=num1/num2;
                System.out.println("Division: "+res);
                break;
                default:
                    System.out.println("Invalid operation Choose operation from 1 to 4");


        }






    }
}
