import java.util.*;
import java.lang.Math;
public class SimpleCalculator {
    static void showmenu(){
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Power (x^y)");
        System.out.println("6. Square Root (√x)");
        System.out.println("7. Sin(x)");
        System.out.println("8. Cos(x)");
        System.out.println("9. Tan(x)");
        System.out.println("10. Log(x)");
        System.out.println("11. Exit");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (true){
            showmenu();
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            if(choice ==11){
                System.out.print("Exiting....");
                break;
            }
            double num1,num2;
            switch(choice){
                case 1: //Addition
                    System.out.print("Enter First number:");
                    num1=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2=sc.nextDouble();
                    System.out.println("Result: "+add(num1,num2));
                    break;
                case 2://substraction
                    System.out.print("Enter First number:");
                    num1=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2=sc.nextDouble();
                    System.out.println("Result: "+sub(num1,num2));
                    break;
                case 3://multiplication
                    System.out.print("Enter First Number: ");
                    num1=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2=sc.nextDouble();
                    System.out.println("Result: "+mul(num1,num2));
                    break;
                case 4://division
                    System.out.print("Enter First Number: ");
                    num1=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2=sc.nextDouble();
                    System.out.print("Result: " + div(num1,num2));
                    break;
                case 5://power
                    System.out.print("Enter Base: ");
                    num1=sc.nextDouble();
                    System.out.println("Enter Exponent: ");
                    num2=sc.nextDouble();
                    System.out.print("Result: "+power(num1,num2));
                    break;
                case 6://Square Root
                    System.out.print("Enter number:");
                    num1=sc.nextDouble();
                    System.out.println("Result: "+sqroot(num1));
                    break;
                case 7://SIN angle
                    System.out.print("Enter angle (in degress): ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: "+sin(num1));
                    break;
                case 8://COS angle
                    System.out.print("Enter angle (in degress): ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: "+cos(num1));
                    break;
                case 9://TAN angle
                    System.out.print("Enter angle (in degress): ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: "+tan(num1));
                    break;
                case 10://Logarithms
                    System.out.print("Enter the Number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: "+log(num1));
                    break;
                default:
                    System.out.println("Invalid Choice! Pleae select a valid option.");
            }
        }
        sc.close();
    }
    //method for Addition.
    public static double add(double num1,double num2){
        return num1+num2;
    }
    //method for Substraction.
    public static double sub(double num1 ,double num2){
        return num1-num2;
    }
    //method for Multiplication.
    public static double mul(double num1,double num2){
        return num1*num2;
    }
    //method for Division.
    public static double div(double num1,double num2){
        return num1/num2;
    }
    //method for power
    public static double power(double num1,double num2){
        return Math.pow(num1,num2);
    }
    //method for square root
    public static double sqroot(double a){
        if(a<0){
            System.out.println("Error! Squrare root of neqitive number");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
    //method for sin angle
    public static double sin(double angle){
        return Math.sin(Math.toRadians(angle));
    }
    //method for cos angle
    public static double cos(double angle){
        return Math.cos(Math.toRadians(angle));
    }
    //method for tan angle
    public static double tan(double angle){
        return Math.tan(Math.toRadians(angle));
    }
    // method for Logarithm
    public static double log(double a){
        if(a<=0){
            System.out.println("Error! Logarithm of non-positive number.");
            return Double.NaN;
        }
        return Math.log(a);
    }

}
