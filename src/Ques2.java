import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=sc.nextInt();
        System.out.println("Enter the numbers:");
        int b=0;
        for(int i=0;i<a;i++){
            int c;
            c=sc.nextInt();
            if(c>=0){
                b+=c;

            }
            else {
                b=-1;
                break;
            }

        }
        System.out.println(b);
    }
}
