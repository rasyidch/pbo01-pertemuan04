package tugas;

public class t_multidimensional_array {public static void main(String[] args) {
    double[][] hargaBBM = new double[5][30];
    double[] liter = new double[30];
    hargaBBM[0][0] = 9500;
    hargaBBM[1][0] = 9000;


    hargaBBM[4][0] = hargaBBM[0][0] + liter[0] +
            hargaBBM[1][0] + liter[1] +
            hargaBBM[2][0] + liter[2] +
            hargaBBM[3][0] + liter[3] ;

    System.out.println("Harga BBM Pertamax :" + hargaBBM[4][0]);

    hargaBBM[0][1] = 9500;
    hargaBBM[1][1] = 9000;


    hargaBBM[4][1] = 0;
    for (int i = 0; i <= 3; i++) {
        hargaBBM[4][1] += hargaBBM[i][1] * liter[i];

    }
    System.out.println("Harga BBM Pertamax :" + hargaBBM[4][1]);

    double jumlahakhir = 0;
    for (int i = 0; i <= 3; i++) {
        jumlahakhir += hargaBBM[4][i];
    }
    System.out.println(jumlahakhir);
}
}
