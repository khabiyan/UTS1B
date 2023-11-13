import java.util.Scanner;
public class suhu {
  public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        System.out.println("Masukkan jenis suhu (F untuk Fahrenheit, R untuk Reamur :");
        char jenisSuhu = P.next().charAt(0);

        System.out.println("Masukkan nilai suhu dalam Celcius: ");
        double suhuCelcius = P.nextDouble();

        double hasil = 0;
        String status = "";

        if (jenisSuhu == 'F' || jenisSuhu == 'f') {
            hasil = (suhuCelcius*9/5)+32;
        }else if (jenisSuhu == 'R' || jenisSuhu == 'r') {
            hasil = suhuCelcius * 4/5;
        }else {
            System.out.println("Jenis suhu tidak valid. Program berhenti.");
            System.exit(0);
        }
        if (hasil % 2 == 0 && hasil % 5 == 0) {
            status = "Kelipatan 2 dan 5";
        } else {
            status = "Bukan kelipatan 2 dan 5";
        }
        System.out.println("Hasil konversi: "+ hasil);
        System.out.println("Status kelipatan: "+ status);
        P.close();
    }
}
