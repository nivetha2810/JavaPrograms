import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp,rem,sum = 0;
        temp = num;
        while(num!=0){
            rem = num%10;
            sum = sum + rem*rem*rem*rem;
            num  = num/10;
        }
        if(temp == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not an armstrong");
        }

    }
}
