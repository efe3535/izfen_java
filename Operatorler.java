/*
 * Operatörler robot geliştirme sürecinde bizim için çok önemli olacak.
 * 
 * Buraya iyi çalışılmalı.
 * 
 * Örneğin robotumuzun kolunun açık olup olmadığını kontrol ederken operatörlerden
 * yararlanacağız.
 * 
 * Veya robotumuzdaki verileri büyüklük küçüklük bakımından karşılaştırırken yine
 * operatörlerden yararlanacağız.
 * 
 */

public class Operatorler {
  int ali = 15;
  int veli = 24;
  // benim yaşım ise 17 olsun.
  int toplam_yas = ali + veli + 17; // toplam yaş bu şekilde hesaplanabilir.

  int yaslar_farki = veli - ali; // 24 eksi 15
  int yaslar_carpimi = ali * veli; // 15 çarpı 24
  int yaslar_orani = ali / veli; // 15 bölü 24

  int sayi = 46;
  int bolen = 6;
  int kalan = sayi % bolen; // % operatörü kullanılarak 46 sayısının 6 ile bölümünden
                            // kalan sayı bulunabilir.
  static int sayac = 0;

  public static void main(String[] args) {
    System.out.println(sayac); // Çıktı: 0
    sayac++;
    System.out.println(++sayac); // Çıktı: 2
    sayac--; // değişkeni 1 azaltmak için -- kullanılır. Başa ve sona konma
             // durumları -- operatörü için de geçerlidir.
    // ++sayac şeklinde kullanım sayacı 1 arttırır ve bu değeri döndürür.
    // sayac++ şeklindeki kullanımda ise sayacın değeri döndürülür ve sayaç 1
    // arttırılır.

    sayac += 15; // sayacı 15 arttır.
    sayac -= 5; // sayacı 5 azalt.

    // KARŞILAŞTIRMA OPERATÖRLERİ
    int a = 25;
    int b = 15;
    System.out.println(a > b); // "true" şeklinde çıktı olacaktır çünkü 25, 15'ten büyüktür.
    int c = 15;
    System.out.println(b == c); // true, b ve c eşittir.
    System.out.println(a == c); // false
    boolean ankara_baskent = true;
    boolean izmir_soguk = false;
    /*
     * Ek olarak, bir sayı diğerinden büyük veya eşitse >= küçük veya eşitse <=
     * operatörleri kullanılır.
     * İki sayının birbirine eşit olmadığı karşılaştırılmak isteniyorsa !=
     * kullanılır.
     * Boolean doğruluk değerini tersine çevirmek için ! operatörü kullanılır
     * 
     * İki boolean verimiz olsun:
     * a doğru olsun.
     * b yanlış olsun.
     * && operatörüyle a && b şeklinde karşılaştırdığımızda "false" dönecektir.
     */
    System.out.println(ankara_baskent && izmir_soguk); // ankara başkenttir ve izmir soğuk değildir. false.
    System.out.println(ankara_baskent || izmir_soguk); // ankara başkenttir ya da izmir soğuk değildir. true.
    System.out.println(!(ankara_baskent && izmir_soguk)); // (ankara başkenttir ve izmir soğuk değildir)'in tersi, true.
  }
}
