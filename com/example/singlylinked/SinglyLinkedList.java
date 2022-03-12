package com.example.singlylinked;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    //mengimplementasikan node
    private ListNode<E> nodePertama;
    private ListNode<E> nodeTerakhir;
    private String pegawai;

    public SinglyLinkedList(){
        this("linked list");
    }

    private ListNode<E> current;

    //membuat semua node kosong/null
    public SinglyLinkedList(String listName){
        pegawai = listName;
        nodePertama = nodeTerakhir = null;
    }

    //input data dari node terdepan
    public void insertFront(E inputData){
        ListNode nodeBaru = new ListNode(inputData);

        //jika belum ada node
        if(kosong()){
            nodePertama = nodeTerakhir = new ListNode<E>(inputData);
        }

        else{
         nodeBaru.next = nodePertama;
         nodePertama = nodeBaru;
        }
    }

    //input data dari node belakang
    public void insertBack(E inputData){
        ListNode nodeBaru = new ListNode(inputData);

        if(kosong()){
            nodeTerakhir= nodeTerakhir = new ListNode<E>(inputData);
        }

        else{
            nodeBaru.next = nodeTerakhir;
            nodeTerakhir = nodeBaru;
        }
    }

    //menghapus data dari node belakang
    public E hapusBelakang() throws NoSuchElementException{
        if(kosong()){//jika node kosong
            throw new NoSuchElementException(pegawai + "Tidak ada data");
        }

        E terhapus = nodeTerakhir.data;
        //jika node satu satunya
        if(nodePertama == nodeTerakhir){
            nodePertama = nodeTerakhir = null;
        }

        else{
           ListNode<E> current = nodeTerakhir;
           while(current.next != nodeTerakhir){
               current = current.next;
           }
           nodeTerakhir = current;
           current.next = null;
        }

        return terhapus;
    }

    public E hapusDepan() throws NoSuchElementException{
        if(kosong()){
            throw new NoSuchElementException(pegawai + "Tidak ada data");
        }

        E terhapus = nodePertama.data;
        if(nodeTerakhir == nodePertama){
            nodeTerakhir = nodePertama = null;
        }

        else{
            ListNode<E> current = nodePertama;
            while(current.next != nodePertama){
                current = current.next;
            }
            nodeTerakhir = current;
            current.next = null;
        }

        return terhapus;
    }



    private boolean kosong(){
        return nodePertama == null;
    }


    //cetak
    public void cetak(){
        if(kosong()){
            System.out.print("Tidak ada data");
            return;
        }

        while(current != null){
            System.out.printf("%s", current.data);
            current = current.next;
            System.out.println();
        }
    }
}
