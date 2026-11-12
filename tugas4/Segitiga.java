package tugas4;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiA, sisiB, sisiC; // Atribut tambahan untuk menghitung keliling segitiga

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getAlas() {
        return this.alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getTinggi() {
        return this.tinggi;
    }

    // Setter untuk sisi-sisi segitiga (diperlukan untuk menghitung keliling)
    public void setSisi(float sisiA, float sisiB, float sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        return sisiA + sisiB + sisiC;
    }
}

