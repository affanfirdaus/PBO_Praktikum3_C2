/*  Nama File   : AngkaSialException.java
    Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
    Nama        : Muhammad Affan Firdaus
    NIM         : 24060123140209
    Tanggal     : 07 - Maret - 2025
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}
