import java.util.Scanner;
import java.math.*;
public class Array {
    public static void main(String[] args) {
        int i,sumodd=0,sumeven=0,diff;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(i = 0;i<n;i++) {
            //System.out.println(array[i]);
            if(array[i]%2==0)
            {
                sumeven+=array[i];
            }
            else {
                sumodd+=array[i];
            }
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
        diff=sumeven-sumodd;
        if (diff<0){
            System.out.println(Math.abs(diff));
        }
        else {
            System.out.println(diff);
        }

    }
}
