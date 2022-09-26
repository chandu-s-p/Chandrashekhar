import java.util.Scanner;
class Calculator
{
        public static void main(String[] args)
        {
                char string;
                double a,b,result;
                Scanner scan=new Scanner(System.in);
                System.out.println("Choose an operation: Addition, Substraction, Multiplication, and Division");
                string=scan.next();
                System.out.println("Enter first number");
                a=scan.nextDouble();
                System.out.println("Enter second number");
                b=scan.nextDouble();
                switch (string) {
                        case 'Addition':
                                result=a+b;
                                System.out.println(a + " + " + b + " = " + result);
                                break;
                        case 'Substraction':
                                result=a-b;
                                System.out.println(a + " - " + b + " = " + result);
                                break;
                        case 'Multiplication':
                                result = a * b;
                                System.out.println(a + " * " + b + " = " + result);
                                break;
                        case 'Division':
                                result = a / b;
                                System.out.println(a + " / " + b + " = " + result);
                                break;
                        default:
                                System.out.println("Invalid operator !");
                                break;
                }
                scan.close();
        }
}
