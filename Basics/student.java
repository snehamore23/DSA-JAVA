import java.util.Scanner;
public class student {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("enter your marks:");
int marks = sc.nextInt();
        
String reportCard = (marks>=35) ? "pass" : "fail";
System.out.print(reportCard);
        
    }
}
