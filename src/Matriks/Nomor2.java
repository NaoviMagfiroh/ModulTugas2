package Matriks;

public class Nomor2 {
    public static void main(String[] args) {
        int[][] A = {
                {5, 7},
                {3, 3},
                {5, 1}
        };
        int[][] B = {
                {1, 2},
                {1, 2},
                {2, 3}
        };
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            for (int[] c : C) {
                for (int q : c) {
                    System.out.print(q + " ");
                }
                System.out.println();
            }
            System.out.println(C[0][1]);
        } else {
            System.out.println("Ukuran matriks tidak sama");

        }
    }
}
