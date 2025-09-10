/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> idPesawat = new ArrayList<String>();
        ArrayList<String> tipePesawat = new ArrayList<String>();
        ArrayList<Integer> kapasitasPesawat = new ArrayList<Integer>();

        idPesawat.add("GA001");
        tipePesawat.add("Boeing 777-9");
        kapasitasPesawat.add(475);

        idPesawat.add("GA002");
        tipePesawat.add("Airbus A350-1000");
        kapasitasPesawat.add(480);

        idPesawat.add("GA003");
        tipePesawat.add("ATR 72-600");
        kapasitasPesawat.add(74);

        idPesawat.add("GA004");
        tipePesawat.add("Bombardier Dash 8 Q400");
        kapasitasPesawat.add(90);

        idPesawat.add("GA005");
        tipePesawat.add("Airbus A380-800");
        kapasitasPesawat.add(853);

        int menu = 0;

        while (menu != 5) {
            System.out.println("\n===== MENU ARMADA PESAWAT =====");
            System.out.println("1. Tambah Armada");
            System.out.println("2. Lihat Armada");
            System.out.println("3. Ubah Armada");
            System.out.println("4. Hapus Armada");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan ID Pesawat: ");
                String id = sc.nextLine();
                idPesawat.add(id);

                System.out.print("Masukkan Tipe Pesawat: ");
                String tipe = sc.nextLine();
                tipePesawat.add(tipe);

                System.out.print("Masukkan Kapasitas Penumpang: ");
                int kapasitas = sc.nextInt();
                sc.nextLine();
                kapasitasPesawat.add(kapasitas);

                System.out.println("Data berhasil ditambahkan!");

            } else if (menu == 2) {
                if (idPesawat.size() == 0) {
                    System.out.println("Belum ada data.");
                } else {
                    System.out.println("\n===== DAFTAR ARMADA =====");
                    for (int i = 0; i < idPesawat.size(); i++) {
                        System.out.println((i+1) + ". ID: " + idPesawat.get(i) +
                                ", Tipe: " + tipePesawat.get(i) +
                                ", Kapasitas Penumpang: " + kapasitasPesawat.get(i));
                    }
                }

            } else if (menu == 3) {
                System.out.print("Masukkan nomor data yang mau diubah: ");
                int no = sc.nextInt();
                sc.nextLine();
                if (no > 0 && no <= idPesawat.size()) {
                    System.out.print("ID Pesawat baru: ");
                    idPesawat.set(no-1, sc.nextLine());
                    System.out.print("Tipe Pesawat baru: ");
                    tipePesawat.set(no-1, sc.nextLine());
                    System.out.print("Kapasitas baru: ");
                    kapasitasPesawat.set(no-1, sc.nextInt());
                    sc.nextLine();
                    System.out.println("Data berhasil diubah!");
                } else {
                    System.out.println("Nomor tidak ditemukan.");
                }

            } else if (menu == 4) {
                System.out.print("Masukkan nomor data yang mau dihapus: ");
                int no = sc.nextInt();
                sc.nextLine();
                if (no > 0 && no <= idPesawat.size()) {
                    idPesawat.remove(no-1);
                    tipePesawat.remove(no-1);
                    kapasitasPesawat.remove(no-1);
                    System.out.println("Data berhasil dihapus!");
                } else {
                    System.out.println("Nomor tidak ditemukan.");
                }

            } else if (menu == 5) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Pilihan tidak ada.");
            }
        }

        sc.close();
    }
}