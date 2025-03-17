/*  Nama File   : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
    Nama        : Muhammad Affan Firdaus
    NIM         : 24060123140209
    Tanggal     : 07 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

// Pertanyaan 1:Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// Ketika as.cobaAngka(10) dipanggil → baris 12 dieksekusi.
// Ketika as.cobaAngka(13) dipanggil → eksepsi dilempar sebelum mencapai baris 12 (tidak dieksekusi).
// Ketika as.cobaAngka(12) dipanggil → tidak dieksekusi karena program sudah masuk ke blok catch.
// Kesimpulan: Baris 12 tidak dieksekusi untuk angka 13 karena eksepsi terjadi sebelum mencapai baris tersebut.

// Pertanyaan 2: Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
// Sebelum mencapai baris 21, program sudah melempar AngkaSialException saat as.cobaAngka(13). Karena ada try-catch, eksepsi akan ditangkap di blok catch, dan setelah itu, program tidak akan kembali ke dalam blok try. Artinya, baris 21 tidak akan dieksekusi.
// Kesimpulan: Baris 21 tidak dieksekusi karena program sudah masuk ke blok catch setelah eksepsi terjadi. 