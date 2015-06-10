/**
 * Created by DELL on 10/06/2015.
 */
public class OperatingSystem {
    private String merk;
    private String color;
    private String buatan;
    private Double versi;
    private Software jenis;

    public OperatingSystem(String merk, String color, String buatan, Double versi, Software jenis) {
        this.merk = merk;
        this.color = color;
        this.buatan = buatan;
        this.versi = versi;
        this.jenis = jenis;
    }

    public OperatingSystem(String merk, String color, Double versi, Software jenis) {
        this.merk = merk;
        this.color = color;
        this.versi = versi;
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBuatan() {
        return buatan;
    }

    public void setBuatan(String buatan) {
        this.buatan = buatan;
    }

    public Double getVersi() {
        return versi;
    }

    public void setVersi(Double versi) {
        this.versi = versi;
    }

    public Software getJenis() {
        return jenis;
    }

    public void setJenis(Software jenis) {
        this.jenis = jenis;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "merk='" + merk + '\'' +
                ", color='" + color + '\'' +
                ", buatan='" + buatan + '\'' +
                ", versi=" + versi +
                ", jenis=" + jenis +
                '}';
    }
}
