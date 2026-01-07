import java.util.Scanner;


public class Calculator {

  public static int add (int a,int b){
    return a+b;
  }

  public static int sub (int a ,int b){
    return a-b;
  }

  public static int mul(int a,int b){
    return a*b;
  }

  public static  int div (int a,int b){
    if(a  == 0 || b == 0){
      System.out.println("Can't be Divided by zero(0)");
      return 0;
    }
    else{
      return a/b;
    }
    
    
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Calculator");
    System.out.println("Enter the values of a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("""
        Please enter your choice :
        1. Addition
        2. Substraction
        3. Multiplication
        4. Division
        """);
    int choice = sc.nextInt();
    switch (choice) {
      case 1 -> System.out.println("result :" + add(a, b));
      case 2 -> System.out.println("Result :" + sub(a,b));
      case 3 -> System.out.println("Result :" + mul(a, b));
      case 4 -> System.out.println("Result:" + div(a, b));
      default -> System.out.println("Error"+ choice+ "Invalid chooice ,Try again 1");
    }

    sc.close();

    }
}   
