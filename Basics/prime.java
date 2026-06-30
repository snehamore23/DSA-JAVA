import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.print("enter your no:");
      int n = sc.nextInt();

      if (n==2){
        System.out.print("prime");
      }else{
      boolean isPrime = true;
      for (int i=2; i<=n-1; i++){
        if (n% i ==0){
            isPrime = false;
        }
      }
      if (isPrime == true){
        
        System.out.print("prime");
      }
      else{
        System.out.print("not prime");
      }
  }  
}
}