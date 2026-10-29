
package tugas3;

public class Main {
    public static void main(String[] args) {
        
     Buku buku1 = new Buku("Anak Remaja","Anatasya",2025);
        buku1.informasi();

   
    Mobil mobil1 = new Mobil("Toyota","Kijang Kapsul");
    Mobil mobil2 = new Mobil("Honda","Civic", 2022);

    mobil1.informasi();
    mobil2.informasi();
    
    
    Lingkaran lngkrn = new Lingkaran(20);
    lngkrn.hitungLuas();

    }
}
