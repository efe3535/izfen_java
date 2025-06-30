public class ifElse {
  static double a = Math.random(), b = Math.random();

  public static void main(String[] args) {
    if (a > b) { // a sayısı b sayısından büyükse
      System.out.println("a b'den daha büyük");
    } else if (a == b) { // a ve b sayıları eşit ise
      System.out.println("a ve b eşit");
    } else { // a sayısı b sayısından küçükse
      System.out.println("a b'den daha küçük");
    }
  }
}
