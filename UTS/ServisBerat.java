public class ServisBerat extends Servis {
    private int hargaSukuCadang;

    public ServisBerat(String kode, String platNomor,
                       int biayaJasa, int hargaSukuCadang,
                       Mekanik mekanik) {
        super(kode, platNomor, biayaJasa, mekanik);
        this.hargaSukuCadang = hargaSukuCadang;
    }

    @Override
    public int hitungBiaya() {
        return biayaJasa + hargaSukuCadang;
    }

    public int getHargaSukuCadang() {
        return hargaSukuCadang;
    }
}