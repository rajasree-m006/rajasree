import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0;
        if(n>0 && n<=100){
            i =n*2;
            System.out.println(i);
        }
        else if(n>100 && n<200){
            i =(n-100)*3;
            i+=200;
            System.out.println(i);
        }
        else{
            i =(n -200)*5;
            i+=500;
            System.out.println(i);

        }
    }
    
}