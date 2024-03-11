public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1= new Ogrenci();
        ogrenci1.setGirisYili(1973);
        ogrenci1.setBolumKodu(104);
        ogrenci1.setOgrNo(ogrenci1.OgrenciNoOlustur( 1));

        Ogrenci ogrenci2= new Ogrenci();
        ogrenci2.setAd("Gökhan");
        ogrenci2.setBolum("Bilgisayar Müh");
        ogrenci2.setGirisYili(1985);
        ogrenci2.setBolumKodu(104);
        ogrenci2.setOgrNo(ogrenci2.OgrenciNoOlustur( 1));

        Ogrenci ogrenci3= new Ogrenci();
        ogrenci3.setAd("Ayşe");
        ogrenci3.setBolum("Makina Müh");
        ogrenci3.setGirisYili(1985);
        ogrenci3.setBolumKodu(104);
        ogrenci3.setOgrNo(ogrenci3.OgrenciNoOlustur( 1));

        Ogrenci ogrenci4= new Ogrenci();
        ogrenci4.setAd("Elif");
        ogrenci4.setBolum("Elektrik-Elektronik Müh");
        ogrenci4.setGirisYili(2020);
        ogrenci4.setBolumKodu(104);
        ogrenci4.setGano(1.98);
        ogrenci4.setOgrNo(ogrenci4.OgrenciNoOlustur( 1));

        System.out.println(String.format("OGR-1"+" "+ogrenci1.getAd()+" "+ogrenci1.getBolum()+" "+ogrenci1.getOgrNo()+" "+ogrenci1.getGano()));
        System.out.println(String.format("OGR-2"+" "+ogrenci2.getAd()+" "+ogrenci2.getBolum()+" "+ogrenci2.getOgrNo()+" "+ogrenci2.getGano()));
        System.out.println(String.format("OGR-3"+" "+ogrenci3.getAd()+" "+ogrenci3.getBolum()+" "+ogrenci3.getOgrNo()+" "+ogrenci3.getGano()));
        System.out.println(String.format("OGR-4"+" "+ogrenci4.getAd()+" "+ogrenci4.getBolum()+" "+ogrenci4.getOgrNo()+" "+ogrenci4.getGano()));
        System.out.println(String.format("3. öğrencinin ödeyeceği harç: " +ogrenci3.harcHesapla(4,39)));
        System.out.println(String.format("4. öğrencinin ödeyeceği harç: " +ogrenci3.harcHesapla(6)));
    }
}