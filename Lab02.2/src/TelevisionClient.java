public class TelevisionClient {
//main class
  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = "Samsung";
    tv1.volume = 20;

    Television tv2 = new Television();
    tv2.brand = "Sony";
    tv2.volume = 50;

    tv1.turnOn();
    tv1.turnOff();

    tv2.turnOn();
    tv2.turnOff();
  }

}
