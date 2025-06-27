public class Veri_Tipleri_Arasi_Donusum {
  int yas = 17;
  double yas_double = yas; // int, double'a dönüştürülebilir.
  // Double veri tipi integer veri tipinden daha çok yer kapladığı için kaynak veri
  // tipini belirtmememizde bir sakınca yoktur.
  
  // Ancak, integer veri tipinden double'a dönüşüm yaparken veri tipini belirtmemiz gerekir.
  double pi = 3.14159265d;
  int pi_sayisi = (int) pi; // pi_sayisi değişkeni 3'e eşittir. virgülden sonraki
                            // basamaklar yok edilir.
  public static void main(String[] args) {
    
  }
}
