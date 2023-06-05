import java.util.Scanner;

public class s99_onefull_pairs{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if((a+b+(a*b))==111) System.out.println("Yes");
        else System.out.println("No");
    }
}