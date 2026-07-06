import java.util.Scanner;
public class linear {

    public static int linearSearch(int number[], int key){
        for (int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main (String args[]){
        int number[] ={2, 4, 6, 8, 10, 12 ,14 , 16};
        Scanner sc = new Scanner(System.in);
         System.out.print("enter String number:");
        int key = sc.nextInt();
       

        int index= linearSearch(number, key);
        if (index==-1){
            System.out.print("not found");
        }else{
             System.out.print("key is at index: " + index);
 
            }
        }
    }
    


