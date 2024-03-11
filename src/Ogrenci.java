public class Ogrenci {
  private   String ad;
  private int girisYili;
  private String bolum;
  private double gano;
  private String ogrNo;
  private int bolumKodu;

   public Ogrenci(String ad, String bolum) {
      this.ad = ad;
      this.bolum = bolum;
   }

   public Ogrenci(String ad,String bolum,  int girisYili, String ogrNo, int bolumKodu) {
      this.ad = ad;
      this.girisYili = girisYili;
      this.bolum = bolum;
      this.ogrNo = ogrNo;
      this.bolumKodu = bolumKodu;
   }

   public Ogrenci(Ogrenci ogrenci){
      this.ad=ogrenci.ad;
      this.girisYili=ogrenci.girisYili;
      this.bolum=ogrenci.bolum;
      this.ogrNo=ogrenci.ogrNo;
      this.bolumKodu=ogrenci.bolumKodu;
      this.gano=ogrenci.gano;
   }

   public Ogrenci() {
   }

   public String getAd() {
      return ad;
   }

   public void setAd(String ad) {
      this.ad = ad;
   }

   public int getGirisYili() {
      return girisYili;
   }

   public void setGirisYili(int girisYili) {
      this.girisYili = girisYili;
   }

   public String getBolum() {
      return bolum;
   }

   public void setBolum(String bolum) {
      this.bolum = bolum;
   }

   public double getGano() {
      return gano;
   }

   public void setGano(double gano) {
      if(gano>=0 && gano <=4)
         this.gano = gano;
      else
         throw new IllegalArgumentException("Lütfen 0 ile 4 arasında bir değer giriniz.");
   }

   public String getOgrNo() {
      return ogrNo;
   }

   public void setOgrNo(String ogrNo) {
      this.ogrNo = ogrNo;
   }

   public int getBolumKodu() {
      return bolumKodu;
   }

   public void setBolumKodu(int bolumKodu) {
      this.bolumKodu = bolumKodu;
   }

   public double harcHesapla(int dersSayisi){
      return  dersSayisi*100;
   }

   public double harcHesapla(int dersSayisi, double uzayanYil){
      return  dersSayisi*100*uzayanYil;
   }

   public String OgrenciNoOlustur(int girisSirasi){
       String bolKod=String.format("%" + 3 + "s", this.bolumKodu).replace(' ', '0');
       String girSir=String.format("%" + 3 + "s", girisSirasi).replace(' ', '0');
       String ogrenciNo=String.format(String.valueOf(this.girisYili)+bolKod+girSir);
       return ogrenciNo;
   }
}
