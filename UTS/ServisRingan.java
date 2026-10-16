public class ServisRingan extends Servis {

    public ServisRingan(String kode, String platNomor,
                        int biayaJasa, Mekanik mekanik) {
        super(kode, platNomor, biayaJasa, mekanik);
    }

    @Override
    public int hitungBiaya() {
        return biayaJasa + 60000;
    }
}