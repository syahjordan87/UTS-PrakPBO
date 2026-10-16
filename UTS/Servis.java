
public abstract class Servis {
    private String kode;
    protected String platNomor;
    protected int biayaJasa;
    private Mekanik mekanik;

    public Servis(String kode, String platNomor,
                  int biayaJasa, Mekanik mekanik) {
        this.kode = kode;
        this.platNomor = platNomor;
        this.biayaJasa = biayaJasa;
        this.mekanik = mekanik;
    }

    public String getKode() {
        return kode;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public int getBiayaJasa() {
        return biayaJasa;
    }

    public Mekanik getMekanik() {
        return mekanik;
    }

    public abstract int hitungBiaya();
}