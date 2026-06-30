import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p =in.nextInt();
        int r =in.nextInt();
        int t =in.nextInt();
        int si=p*r*t/100;
        int a=p*si;
        System.out.println(si);
        System.out.println(a);
        in.close();

    }
}
