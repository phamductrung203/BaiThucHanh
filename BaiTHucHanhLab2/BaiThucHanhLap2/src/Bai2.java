import java.util.Scanner;

public class Bai2 {
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chu so can kiem tra ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.printf("%d La so chan ",n);
        }
        else{
            System.out.printf("%d la so le ",n);
        }
    }
}
