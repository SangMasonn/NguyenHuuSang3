package assignments.pkg5;

import java.util.Scanner;

public class bangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap bang cuu chuong ban muon: ");
        int number = scanner.nextInt();

        System.out.println("Bang Cuu Chuong " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
