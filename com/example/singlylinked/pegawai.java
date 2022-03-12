package com.example.singlylinked;
public class pegawai {
    private String nip;
    private String nama;
    private String divisi;

    public pegawai(String nip, String nama, String divisi){
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip(){
        return nip;
    }

    @Override
    public String toString(){
        return "nip='" + nip + '\'' + ", nama='" + nama + '\'' +
                ", divisi =" + divisi + '\'';
    }
}
