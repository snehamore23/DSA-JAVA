import java.util.Scanner;

public class logical {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter first no:");
        int a = sc.nextInt();

        System.out.print("enter second no:");
        int b = sc.nextInt();

        System.out.println("a > b && a<b : " + (a > b && a<b));
        System.out.println("a > b || a < b : " + (a > b || a < b));
        System.out.println("!(a > b) : " + !(a > b));
        sc.close();

    }
    
}
