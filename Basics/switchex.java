import java.util.Scanner;

public class switchex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int number = sc.nextInt();
        switch (number)
{

    case 1: System.out.print("samosa");
    break;
    case 2: System.out.print("vada");
    break;
    case 3: System.out.print("idli");
    break;
    default: System.out.print("invalid number");
}    }
}
