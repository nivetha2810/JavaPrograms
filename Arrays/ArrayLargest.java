import java.util.Scanner;
public class ArrayLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest=arr[1];
        for(i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);

    }
}
