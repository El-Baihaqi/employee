package emplooyee;

import java.util.Scanner;

public class Kantor {

    public static final Scanner sc = new Scanner(System.in);

    int lamakerja = 0, gaji = 0;

    void nama() {
        System.out.print("Masukkan Nama : ");
        String nama = sc.next();

    }

    float nip() {
        System.out.print("Masukkan nip : ");
        int nip = sc.nextInt();
        return 0;
    }

    public static void fungsi() {
        System.out.print("Jam kerja : ");
        int jamkerja = sc.nextInt();
        System.out.print("Jabatan : ");
        String jabatan = sc.next();
        if (jabatan.equalsIgnoreCase("Boss")) {
            boss a = new boss();
            System.out.println("Gaji Akhir kamu :"+a.potongan(jamkerja));
        } else if (jabatan.equalsIgnoreCase("manager")) {
            Manager b = new Manager();
            System.out.println("Gaji Akhir Kamu :"+b.potongann(jamkerja));
        } else if (jabatan.equalsIgnoreCase("cleaningservice")) {
            CleaningService c = new CleaningService();
            System.out.println("Gaji Akhir Kamu :"+c.potongann(jamkerja));
        } else if (jabatan.equalsIgnoreCase("internship")) {
            Internship b = new Internship();
            System.out.println("Gaji akhir kamu : "+b.potongann(jamkerja));
        }

    }

}
