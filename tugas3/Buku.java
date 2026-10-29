
package tugas3;

public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;
    
    Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    Buku(String Pengarang, int tahunTerbit){
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    Buku(int tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    Buku(String pengarang){
        this.pengarang = pengarang;
    }
    
    Buku(String judul, String Pengarang){
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    Buku(int tahunTerbit, String judul){
        this.tahunTerbit = tahunTerbit;
        this.judul = judul;
    }
    
    
    void informasi(){
        System.out.println("Informasi Buku");
        System.out.println("Judul Buku : " + this.judul);
        System.out.println("Pengarang Buku : " + this.pengarang);
        System.out.println("Tahun Terbit Buku : " + this.tahunTerbit);
    }
}
