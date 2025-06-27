public class Degiskenler_Veri_Tipleri {
  String cumle = "Programlamayı çok seviyorum."; // Birden fazla karakterden oluşan
                                                  // veriler için String kullanılır.
  int numara = 35; // Küsürat bulunmayan sayılar için Integer (int) kullanılır.
  
  float pi = 3.14f; // Float, küsüratlı sayıları depolamak için kullanılır.
                    // Sayının float tipinde olduğunu belirtmek için sonuna f konur.
                    // Eğer virgülden sonraki basamak sayısı fazlaysa
  double pi_uzun = 3.14159265; // double kullanılması gerekir.
  
  // Double ve float veri tipleri robotumuzda matematiksel hesaplamalar yapacağımız zaman ölçtüğümüz
  // sabitleri depolamak için kullanılabilirler. 

  char harf = 'q'; // Char, tek harf depolar. 
  
  boolean aciktimMi = false; // Doğruluk değeri 0 veya 1 olabilir. 1 için true, 0 için false kullanılır.
  // Boolean önemli bir veri tipidir. Robotumuzda da sık sık kullanacağımız
  // bir veri tipidir.
  // Örnek vermek gerekirse, robotun kolunun kaldırılıp kaldırılmadığı boolean
  // veri tipiyle gösterilebilir.

  byte kucuk_sayi = 15; // -127 ve 128 arasındaki sayılar byte ile ifade edilebilir.
  short sayi_1 = 5500; // -32767 ve 32768 arasındaki sayılar short ile ifade edilebilir.
 
  public static void main(String[] args) {  
  }
}
