public class MainVarian9 {
    public static void main(String[] args) {

        Mekanik mekanik = new Mekanik("Pak Slamet", "Mesin");

        Bengkel bengkel = new Bengkel("Jaya Motor", 3);
        bengkel.setKepala(mekanik);

        Servis servisRingan = new ServisRingan("SRV-01","N 2211 AA",50000,mekanik);

        Servis servisBerat = new ServisBerat("SRV-02","N 3344 BB",200000,450000,mekanik);

        NotaPrinter printer = new NotaPrinter("Thermal");
        bengkel.terimaServis(servisRingan, 1);
        bengkel.terimaServis(servisBerat, 3);

        System.out.println("Nota:");
        printer.cetakNota(servisRingan);
        printer.cetakNota(servisBerat);

        System.out.println("\nInformasi Bengkel:");
        bengkel.tampilInfo();


        System.out.println("\nServis Selesai:");
        Servis selesai = bengkel.selesaikan(1);

        if (selesai != null) {System.out.println(selesai.getKode() + " selesai, total: "+ selesai.hitungBiaya());
        }
        System.out.println("\nKondisi Bay Setelah Servis:");
        bengkel.tampilInfo();
    }
}
