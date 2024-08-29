import java.util.Scanner;
public class amicable{
    public static void main(String[] args) {
        int sum1 = 0,sum2 =0;
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc .nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        for (int i = 1; i < a;i++){
            if(a%i==0){
                sum1 = sum1 + i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0)
            sum2 = sum2 + i;
        }
        if(a==sum2 && b==sum1){
            System.out.println("Amicable");
        }
        else{
            System.out.println("not amicable");
        }
    }
}
