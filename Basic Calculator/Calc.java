import java.util.Scanner;

public class Calc{
  public static void main(String[] args) {
    Advanced obj=new Advanced();
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int product=obj.multi( n1,n2);
    int quotient=obj.div(n1, n2);
    int sum=obj.add(n1, n2);
    int subtraction=obj.sub(n1, n2);
    System.out.println("This is the product: "+product);
    System.out.println("This is the division: "+quotient);
    System.out.println("This is the sum: "+sum);
    System.out.println("This is the subtraction: "+subtraction);
}
}
