package tugas4;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getPanjang() {
        return this.panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getLebar() {
        return this.lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}

