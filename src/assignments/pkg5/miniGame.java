
package assignments.pkg5;
    import java.util.Scanner;
    import java.util.Random;
public class miniGame {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int So = random.nextInt(50) + 1;
        int soNguoiChon = 0;
        
        while(So != soNguoiChon){
            System.out.print("Nhap so muon chon: ");
            soNguoiChon = scanner.nextInt();
        }
        if(soNguoiChon < So){
            System.out.print("Your number is lower. Try again. ");
        }else if(soNguoiChon > So){
            System.out.print("Your number is higher. Try again.");
        }else{
            System.out.print("Congratulations");
        }
        
     }
}
