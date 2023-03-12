import java.util.Scanner;

public class App{
   
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap vao so luong phan tu trong mang 1 chieu :");
        n = sc.nextInt();
        do{
             System.out.println("Nhap vao so luong phan tu trong mang 1 chieu :");
            n = sc.nextInt();
        }while (n<=0);
    }
}