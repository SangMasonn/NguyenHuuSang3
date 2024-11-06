package assignments.pkg5;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so trong day Fibonacci: ");
        int n = scanner.nextInt();
        
        int soThuNhat = 0, soThuHai =1;
        System.out.print("Day so Fibonacci \n");
        
        for(int i = 1; i <= n; i++){
            if(i == 1){
                System.out.print(soThuNhat);
            }else if(i == 2){
                System.out.print("," + soThuHai);
            }else {
                int soTiepTheo = soThuNhat + soThuHai;
                System.out.print(", " + soTiepTheo);
                soThuNhat = soThuHai;
                soThuHai = soTiepTheo;
            }
        }
        
        }   
    }