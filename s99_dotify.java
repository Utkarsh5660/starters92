import java.util.Arrays;
import java.util.Scanner;

public class s99_dotify {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        for(int z=0;z<t;z++){
            int n= in.nextInt();
            int k= in.nextInt();
            int l= in.nextInt();
            int arr[] = new int[n];
            int k1 =0;
            for(int i=0; i<n; i++){
                int j1 = in.nextInt();
                int j2 = in.nextInt();
                if(j2==l)arr[k1++] = j1;
            }
        Arrays.sort(arr);
        if(k1>=k)
        {
        int sum =0;
        for(int i=n-1; k>0; i--){
            sum = sum + arr[i];
            k--;
        }
        System.out.println(sum);
    }

        else System.out.println(-1);
        }
    
    }
}
