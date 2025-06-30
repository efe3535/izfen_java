public class While {

  public static void main(String[] args) {
    int a = 5, b = 3;
    while (a < 15) { // döngü şartı sağlanıyorsa döngü çalışır.
      System.out.println(a);
      a++;
    }

    do {
      System.out.println("Test");
      b++;
    } while (b < 3); // "Test" yazdırılır çünkü do {} içerisinde bulunan kısım döngü şartının
                     // sağlanmasına
                     // bakılmadan 1 defa
                     // çalışır,
                     // sonra döngü şartı aranmaya başlanır.
  }
}
