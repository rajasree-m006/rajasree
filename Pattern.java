import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<=n-i;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }
        
    }
    
}
