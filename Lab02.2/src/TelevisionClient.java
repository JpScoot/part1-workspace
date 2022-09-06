public class TelevisionClient {
//main class
//main method
  public static void main(String[] args) {

    //create instances(objects) of Television class getters and setters
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(20);

    Television tv2 = new Television();
    tv2.setBrand("Sony");
    tv2.setVolume(50);

    tv1.turnOn();
    tv1.turnOff();

    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv1.toString());
    System.out.println(tv1);
  }

}
