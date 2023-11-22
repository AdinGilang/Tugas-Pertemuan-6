package Pertemuan6;
/**
 *
 * @author ading
 */
import java.util.Scanner;

public class LaguAnakAyamTurun {
    public static void main(String[] args) {
        
        System.out.println("===  Perulangan For ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
      
        System.out.println("\n===  Perulangan While ===");
        int j = 5;
        while (j >= 1) {
            System.out.println("Anak ayam turun " + j + ", mati satu tinggal " + (j - 1));
            j--;
        }

        System.out.println("\n===  Perulangan Do-While ===");
        int k = 5;
        do {
            System.out.println("Anak ayam turun " + k + ", mati satu tinggal " + (k - 1));
            k--;
        } while (k >= 1);
    }
}


