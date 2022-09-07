public class Television {

  //declare instant variables or fields
  //type name
  //private
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  private static int instanceCount = 0;
  private String brand;
  private int volume;

  //constructor method (no arguments)
  public Television() {
    instanceCount++;
  }
  //constructor calls setter
  public Television(String brand) {
    this();
    setBrand(brand);
  }

  //constructor invokes String brand constructor
  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);

  }


  //write business methods
//public modifiers
  public void turnOn() {
    //boolean variable = (assign a value)
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on with a volume of " + volume);

  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off! ");
  }

  public static int getInstanceCount(){
    return instanceCount;
  }
  public String getBrand() {
    return brand;
  }

  //Accessor Methods
  public void setBrand(String brand) {

    switch (brand) {
      case"Samsung":
      case"LG":
      case"Sony":
      case"Toshiba":
        this.brand = brand;
        break;
      default:
        System.out.printf("");;
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME){
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n",volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  //helper method always private
  private boolean verifyInternetConnection() {
    return true;
  }

  //toString()
  @Override
  public String toString() {
    return "Television{" +
        "brand='" + brand + '\'' +
        ", volume=" + volume +
        '}';
  }
}
