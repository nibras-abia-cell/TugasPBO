package tugas4;

public abstract class BangunDatar {

    public abstract float luas();
    public abstract float keliling();

    public float getLuas() {
        return this.luas();
    }

    public float getKeliling() {
        return this.keliling();
    }
}

