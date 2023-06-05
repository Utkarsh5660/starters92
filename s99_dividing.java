import java.util.Arrays;
import java.util.Scanner;

public class s99_dividing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        for(int z=0;z<t;z++){
            int n= in.nextInt();
            int k= in.nextInt();
            int arr[] = new int[n];
            int s =0;
            for(int i=0; i<n; i++){  
                arr[i] = in.nextInt();
                s = s+arr[i];
            }
            Arrays.sort(arr);
            if(s<k) System.out.println(0);
            else{

            }
            // 3
            // 9   6   4  2  1
            // 4 2 1
            // 6 4 2
            // 9 6 4
            // 9 6 4

            // 3
            // 10,7,5,4,2
            // 5,4,2
            // 5,4,2
            // 7,5,4
            // 7,5,4
            // 10,7,5

            // 2
            // 5,6
            if(k==1) System.out.println(s);
            else{
                // k--;
                int ans =0;
                for(int i=n-1; k>0; i--){
                    ans = arr[i];
                    k--;
                }
                System.out.println(ans);
            }

        }
    }
}


// pending ....