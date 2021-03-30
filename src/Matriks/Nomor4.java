package Matriks;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[]args){
        int i, j, k, l;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris Matriks : ");
        k = scan.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks : ");
        l = scan.nextInt();
        System.out.println("Masukkan Elemen Matriks : ");
        for (i=0; i < k; i++) {
            for (j = 0; j < l; j++) {
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil Matriks : ");
        for (i = 0; i < k; i++) {
            for (j = 0; j < l; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < k;i++) {
            for (j = 0; j < l; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks : ");
        for(i = 0;i < l;i++){
            for (j = 0; j < k; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();

        }


    }
}


