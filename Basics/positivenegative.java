import java.util.Scanner;
public class positivenegative {
    public static void main(String []args) {

    Scanner sc = new Scanner (System.in);

    System.out.print("enter your number:");
    int number = sc.nextInt();

    if(number>0){
        System.out.print("positive number");
    }else{
        System.out.print("negative number");
    }

}
}
