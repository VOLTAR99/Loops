import java.util.Scanner;
public class Ques3 {
    static void factorial(int a){
        int b=1;
        for(int i=1;i<=a;i++){
            b*=i;
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int a=sc.nextInt();
        factorial(a);
    }
}
