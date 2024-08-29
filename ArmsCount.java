import java.sql.SQLOutput;
import java.util.Scanner;
public class armscount{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1,temp2,rem;
        double sum = 0;
        temp1 = num;
        temp2 = num;
        int count =0;
        while(temp1>0){
            temp1 = temp1 /10;
            count++;
        }
        while(num!=0){
            rem = num%10;
            sum = sum + Math.pow(rem,count);
            num  = num/10;
        }
        if(temp2 == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not an armstrong");
        }
    }
}
