import java.util.Scanner;


public class Calculator {

  public static double add (double a,double b){
    return a+b;
  }

  public static double sub (double a ,double b){
    return a-b;
  }

  public static double mul(double a,double b){
    return a*b;
  }

  public static  double div (double a,double b){
    if( b == 0){
      System.out.println("Can't be Divided by zero(0)");
      return 0;
    }
    else{
      return a/b;
    }
    
    
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String res = "Result :";
    boolean running = true;
    while (running) {
      
    
    System.out.println("Calculator");
    System.out.println("Enter the values of a and b");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    System.out.println("""
        Please enter your choice :
        1. Addition
        2. Substraction
        3. Multiplication
        4. Division
        5. Exit
        """);
    int choice = sc.nextInt();
    if (choice == 5) {
      running = false;
      System.out.println("Thankyou"); 
    }
    switch (choice) {
      case 1 -> System.out.println(res + add(a, b));
      case 2 -> System.out.println(res + sub(a,b));
      case 3 -> System.out.println(res + mul(a, b));
      case 4 -> System.out.println(res + div(a, b));
      
      
    }

   }

    sc.close();

    }
}   
