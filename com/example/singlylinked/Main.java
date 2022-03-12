package com.example.singlylinked;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList<pegawai> linkedList = new SinglyLinkedList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Pilihlah Menu:");
        System.out.println("1. Input data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cetak List Pegawai");
        System.out.println("4. Keluar");

        int pilihan = input.nextInt();

        if(pilihan == 1){
            int inputData = input.nextInt();

            System.out.println("Tambahkan di awal list? 1 = iya, 0 = tidak");
            String nip = input.nextLine();
            String nama = input.nextLine();
            String divisi = input.nextLine();
            if(inputData == 1){
                linkedList.insertFront(new pegawai(nip, nama, divisi));
            }

            else{
                linkedList.insertBack(new pegawai(nip, nama, divisi));
            }
        }

        if(pilihan == 2){
            int inputData = input.nextInt();

            System.out.println("Hapus dari awal list? 1 = iya, 0 = tidak");
            if(inputData == 1){
                linkedList.hapusDepan();
            }else{
                linkedList.hapusBelakang();
            }
        }

        if(pilihan == 3){
            linkedList.cetak();
        }

        if(pilihan == 4){
            System.out.println("Keluar.");
        }

        else{
            System.out.println("Error");
        }
    }

}
