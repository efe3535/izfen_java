public class Switch {
  static int secim = 5;

  public static void main(String[] args) {
    switch (secim) {
      case 5: // secim sayısı 5'e eşitse
        System.out.println("asansör 5. kata çıkıyor");
        break;
      case 3:
        System.out.println("asansör 3. kata çıkıyor");
        break;
      default: // secim sayısı yukarıdaki değerlere eşit değilse,
        System.out.println("doğru numara girilmedi.");
    }
  }
}
