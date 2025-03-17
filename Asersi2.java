/*  Nama File   : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol 
    Nama        : Muhammad Affan Firdaus
    NIM         : 24060123140209
    Tanggal     : 07 - Maret - 2025
*/
//class lingkaran 
class Lingkaran{
    private double jariJari;
    public Lingkaran (double  jariJari){
        this.jariJari = jariJari;
    }public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

// Pertanyaan : Secara konsep, ada yang kurang tepa pada proggram Asersi 2 di atas 
// Jawaban : Assertanya lebih baik di buat di class lingkaran di atas karena lebih baik jika exceptionnya di lakukan sebelum membuat lingkaran