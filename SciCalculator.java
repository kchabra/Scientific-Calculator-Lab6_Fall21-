import java.util.Scanner;
import java.lang.Math;
public class SciCalculator {//Scientific Calculator for Lab 4, cop3502c
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //creating variable to display current value to the user
        double result;
        result = 0.0;
        //creating variable t to use for while loop to keep on running the program until the user chooses to exit
        int t;
        t = 0;
        int input;
        input = 0;
        double c;
        double b;
        System.out.println("\nCurrent Result: " + (result));


        //using while loop to display the menu to the user until they input 0
        while (true) {
            System.out.println("\nCalculator Menu");//prints menu
            System.out.println("---------------");
            System.out.println("0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average ");
            System.out.println("\nEnter Menu Selection: ");
            input = scnr.nextInt();

             //displays output according to user's input from the menu
            if (input == 0) {//terminates the program as the user entered 0
                System.out.println("Thanks for using this calculator. Goodbye! ");
                System.exit(0);
            } else if (input == 1) {//adds both the operands
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double sum = b + c;
                System.out.println("\nCurrent Result: " + (sum));//displays sum of both operands
                result=result+sum;//adding the value to the total 'result' to use it for average
                t=t+1;//using integer t to count the number of calculations
            } else if (input == 2) {//subtracts the operands
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double difference = b - c;
                System.out.println("\nCurrent Result: " + (difference));//displays the difference of both the operands
                result=result+difference;//adding the value to the total 'result' to use it for average
                t=t+1;//using integer t to count the number of calculations
            } else if (input == 3) {//multiplies the operands
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double product = b * c;
                System.out.println("\nCurrent Result: " + (product));//displays product of both the operands
                result=result+product;//adding the value to the total 'result' to use it for average
                t=t+1;//using integer t to count the number of calculations
            } else if (input == 4) {
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double quotient = b / c;
                System.out.println("\nCurrent Result: " + (quotient));//displays the quotient after dividing the operands
                result=result+quotient;//adding the value to the total 'result' to use it for average
                t=t+1;//using integer t to count the number of calculations
            } else if (input == 5) {
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double exponent = (double) Math.pow(b, c);//calculates the exponent result using java's math library
                System.out.println("\nCurrent Result: " + (exponent));
                result=result+exponent;//adding the value to the total 'result' to use it for average
                t=t+1;//using integer t to count the number of calculations
            } else if (input == 6) {
                System.out.println("Enter first operand: ");
                b = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                c = scnr.nextDouble();
                double log = (double) Math.log(c) / Math.log(b);//calculates the log value using java's math library
                System.out.println("\nCurrent Result: " + (log));
                result=result+log;// using integer t to count the number of calculations
                t=t+1;
            } else if (input==7){
                if (t>0){
                    System.out.println("\nSum of calculations: "+(result));
                    System.out.println("Number of calculations: "+(t));
                    System.out.println("Average of calculations: "+(result/t));
                } else{
                    int av;
                    av=0;
                    while(av==0){
                        System.out.println("\nError: No calculations yet to average!");
                        System.out.println("\nEnter Menu Selection: ");
                        input = scnr.nextInt();
                        if (input == 0) {
                            System.out.println("Thanks for using this calculator. Goodbye! ");
                            System.exit(0);
                        } else if (input == 1) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double sum = b + c;
                            System.out.println("\nCurrent Result: " + (sum));
                            result=result+sum;
                            t=t+1;
                            av=av+1;
                        } else if (input == 2) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double difference = b - c;
                            System.out.println("\nCurrent Result: " + (difference));
                            result=result+difference;
                            t=t+1;
                            av=av+1;
                        } else if (input == 3) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double product = b * c;
                            System.out.println("\nCurrent Result: " + (product));
                            result=result+product;
                            t=t+1;
                            av=av+1;
                        } else if (input == 4) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double quotient = b / c;
                            System.out.println("\nCurrent Result: " + (quotient));
                            result=result+quotient;
                            t=t+1;
                            av=av+1;
                        } else if (input == 5) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double exponent = (double) Math.pow(b, c);
                            System.out.println("\nCurrent Result: " + (exponent));
                            result=result+exponent;
                            t=t+1;
                            av=av+1;
                        } else if (input == 6) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double log = (double) Math.log(c) / Math.log(b);
                            System.out.println("\nCurrent Result: " + (log));
                            result=result+log;
                            t=t+1;
                            av=av+1;
                        } else if(input==7){
                            if (t>0){
                                System.out.println("\nSum of calculations: "+(result));
                                System.out.println("Number of calculations: "+(t));
                                System.out.println("Average of calculations: "+(result/t));
                            } else{
                                System.out.println("\nError: No calculations yet to average!");
                                System.out.println("\nEnter Menu Selection: ");
                                input = scnr.nextInt();
                            }
                        } else {
                        System.out.println("Error: Invalid selection! ");
                        System.out.println("\nEnter Menu Selection: ");
                        input = scnr.nextInt();
                        }
                    }
                }
            } else {
                System.out.println("Error: Invalid selection! ");
                System.out.println("\nEnter Menu Selection: ");
                input = scnr.nextInt();
                int bv;
                bv=0;
                while (bv==0){
                    if (input == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye! ");
                        System.exit(0);
                    } else {
                        if (input == 1) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double sum = b + c;
                            System.out.println("\nCurrent Result: " + (sum));
                            bv=bv+1;
                        } else if (input == 2) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double difference = b - c;
                            System.out.println("\nCurrent Result: " + (difference));
                            bv=bv+1;
                        } else if (input == 3) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double product = b * c;
                            System.out.println("\nCurrent Result: " + (product));
                            bv=bv+1;
                        } else if (input == 4) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double quotient = b / c;
                            System.out.println("\nCurrent Result: " + (quotient));
                            bv=bv+1;
                        } else if (input == 5) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double exponent = (double) Math.pow(b, c);
                            System.out.println("\nCurrent Result: " + (exponent));
                            bv=bv+1;
                        } else if (input == 6) {
                            System.out.println("Enter first operand: ");
                            b = scnr.nextDouble();
                            System.out.println("Enter second operand: ");
                            c = scnr.nextDouble();
                            double log = (double) Math.log(c) / Math.log(b);
                            System.out.println("\nCurrent Result: " + (log));
                            bv=bv+1;
                        } else if (input==7){
                            if (t>0){
                                System.out.println("\nSum of calculations: "+(result));
                                System.out.println("Number of calculations: "+(t));
                                System.out.println("Average of calculations: "+(result/t));
                                bv=bv+1;
                            } else{
                                System.out.println("\nError: No calculations yet to average!");
                                System.out.println("\nEnter Menu Selection: ");
                                input = scnr.nextInt();
                            }
                         } else{
                            System.out.println("Error: Invalid selection! ");
                            System.out.println("\nEnter Menu Selection: ");
                            input = scnr.nextInt();
                        }
                    }
                }
            }
        }
    }
}


