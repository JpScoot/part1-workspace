public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv1 = new Television();

    tv1.setBrand("Samsung");
    System.out.println(tv1.getBrand()); //should print Samsung

    tv1.setBrand("LG");
    System.out.println(tv1.getBrand()); //should print LG

    tv1.setBrand("Sony");
    System.out.println(tv1.getBrand()); //should print Sony

    tv1.setBrand("Toshiba");
    System.out.println(tv1.getBrand()); //should print Toshiba

    tv1.setBrand("Hisense");
    System.out.println(tv1.getBrand()); // invalid message

    tv1.setVolume(Television.MAX_VOLUME); //print 100
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MIN_VOLUME); // print 0
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MAX_VOLUME + 1); //error message
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MIN_VOLUME - 1); // error message
    System.out.println(tv1.getVolume());










  }




}
