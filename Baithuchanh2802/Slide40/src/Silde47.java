import java.util.Scanner;

public class Silde47 {
    public static void main(String[]args){
        int n, sum =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap n :");
            n=sc.nextInt();
            sum+=n;
            if(sum>100)
             break;
        }while(n>0);
        System.out.println("Tong= "+sum);

    }   
}
