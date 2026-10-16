public class Bengkel {
    private String nama;
    private BayServis[] daftarBay;
    private Mekanik kepala;

    public Bengkel(String nama, int jumlahBay) {
        if (jumlahBay <= 0) {
            throw new IllegalArgumentException(
                "Jumlah bay harus lebih dari 0."
            );
        }

        this.nama = nama;
        this.daftarBay = new BayServis[jumlahBay];

        for (int i = 0; i < jumlahBay; i++) {
            daftarBay[i] = new BayServis(i + 1);
        }
    }

    public void setKepala(Mekanik kepala) {
        if (kepala == null) {
            throw new IllegalArgumentException(
                "Kepala bengkel tidak boleh null."
            );
        }

        this.kepala = kepala;
    }

    public boolean terimaServis(Servis servis) {
        if (servis == null) {
            return false;
        }

        for (BayServis bay : daftarBay) {
            if (bay.getServis() == null) {
                return bay.terimaServis(servis);
            }
        }

        return false;
    }

    public boolean terimaServis(Servis servis, int nomorBay) {
        if (servis == null || nomorBay < 1
                || nomorBay > daftarBay.length) {
            return false;
        }

        return daftarBay[nomorBay - 1].terimaServis(servis);
    }

    public Servis selesaikan(int nomorBay) {
        if (nomorBay < 1 || nomorBay > daftarBay.length) {
            return null;
        }

        return daftarBay[nomorBay - 1].selesaikan();
    }

    public void tampilInfo() {
        System.out.println("Bengkel: " + nama);

        if (kepala != null) {
            System.out.println(
                "Kepala: " + kepala.getNama()
                + " (" + kepala.getSpesialisasi() + ")"
            );
        }

        for (BayServis bay : daftarBay) {
            Servis s = bay.getServis();

            if (s == null) {
                System.out.println(
                    "Bay " + bay.getNomor() + ": Kosong"
                );
            } else {
                System.out.println(
                    "Bay " + bay.getNomor() + ": "
                    + s.getPlatNomor()
                );
            }
        }
    }
}
