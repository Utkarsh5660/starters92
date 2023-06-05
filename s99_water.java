import java.util.Scanner;

public class s99_water {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t = in.nextInt();
       for(int z=0;z<t;z++){
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       if((a+b+c)<2) System.out.println("Water filling time");
       else System.out.println("Not now");
    }
}
}
