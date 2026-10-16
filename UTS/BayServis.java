public class BayServis {
    private int nomor;
    private Servis servis;

    public BayServis(int nomor) {
        this.nomor = nomor;
        this.servis = null;
    }

    public int getNomor() {
        return nomor;
    }

    public Servis getServis() {
        return servis;
    }

    public boolean terimaServis(Servis servis) {
        if (servis == null || this.servis != null) {
            return false;
        }

        this.servis = servis;
        return true;
    }

    public Servis selesaikan() {
        if (servis == null) {
            return null;
        }

        Servis selesai = servis;
        servis = null;
        return selesai;
    }
}