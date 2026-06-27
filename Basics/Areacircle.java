import java.util.Scanner;
public class Areacircle {
    public static void main (String args[]){
        Scanner sc=  new Scanner (System.in);
        System.out.print ("Enter area of circle :");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.print("Area of circle is : " + area);
        sc.close();

    }
    
}
