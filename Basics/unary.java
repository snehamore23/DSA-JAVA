import java.util.*;
public class unary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter no");
        int a= sc.nextInt();

        System.out.println("original value="+a);

        //post increment

        System.out.println("post increment (a++)=" + (a++));
        System.out.println("value after post increment="+a );

        //pre increment
        System.out.println("post increment (++a)=" + (++a));

        //post decrement

        System.out.println("post decrement (a--)=" + (a--));
        System.out.println("value after post decrement="+a );

        // pre decrement

        System.out.println("post decrement (--a)=" + (--a));

        sc.close();
    


    }
    
}
