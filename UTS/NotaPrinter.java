public class NotaPrinter {
    private String model;

    public NotaPrinter(String model) {
        this.model = model;
    }

    public void cetakNota(Servis servis) {
        if (servis == null) {
            System.out.println("Servis tidak valid.");
            return;
        }

        String jenis;

        if (servis instanceof ServisRingan) {
            jenis = "Ringan";
        } else if (servis instanceof ServisBerat) {
            jenis = "Berat";
        } else {
            jenis = "Umum";
        }

        System.out.println("Nota [" + jenis + "]");
        System.out.println("Kode: " + servis.getKode());
        System.out.println("Plat: " + servis.getPlatNomor());
        System.out.println("Mekanik: " + servis.getMekanik().getNama());
        System.out.println("Total: " + servis.hitungBiaya());
    }
}
