import java.util.Scanner;

class Main {
  public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf(" Enter first number = ");
    string number1 = scanner.next();
    scanner.nextLine();
    System.out.printf(" Enter second number = ");
    string number2 = scanner.next();
    scanner.nextLine();
    System.out.printf(" Enter operation = ");
    String operation = scanner.nextLine();

    if(operation.equals("sum")) {
      System.out.printf(" %s + %s = %s", number1,number2, number1 + number2 );
    } else if(operation.equals("sub")) {
      System.out.printf("%s - %s = %s " ,number1, number2, number1 - number2   );
    } else if(operation.equals("multi")) {
      System.out.printf( "%s * %s = %s ", number1, number2, number1*number2 );
    }  else if(operation.equals("div")) {
      System.out.printf("%s/%s = %s" , number1, number2 , number1/number2  );
      
    }
    scanner.close();
      }
}
