package tugas4;

public class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return this.jari;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * jari * jari);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * jari);
    }
}

