import java.util.Scanner;

public class product{
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter first no: ");
    int a = sc.nextInt();

    System.out.print("Enter second no: ");
    int b = sc.nextInt();

    int product = a * b;
    System.out.print("the product is : " + product);

}
}
