import java.util.Scanner;

public class s99_rectangluar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int t = in.nextInt();
         for(int z=0;z<t;z++){
            int l = in.nextInt();
            int b = in.nextInt();
            if(l%2==0||b%2==0) System.out.println("YES");
            else System.out.println("NO");
         }
    }
}
