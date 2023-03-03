import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the number of terms up to which you want to print:");
        int c= sc.nextInt();
        int d;
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<c-2;i++){
            d=a+b;
            System.out.println(d);
            a=b;
            b=d;

        }

    }
}
