package com.entertainment;

public class Television {

  //declare instant variables or fields
  //type name
  //private
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  private static int instanceCount = 0;
  private String brand;
  private int volume;

  //invoke constructor method
  private DisplayType display = DisplayType.LED;

  //constructor method (no arguments)
  public Television() {
    instanceCount++;
  }

  //constructor calls setter
  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);

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

  public static int getInstanceCount() {
    return instanceCount;
  }

  //access methods getter and setters
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {

    switch (brand) {
      case "Samsung":
      case "LG":
      case "Sony":
      case "Toshiba":
        this.brand = brand;
        break;
      default:
        System.out.printf(
            "%s is not a valid brand; only Samsung, LG, Sony, and Toshiba are allowed.%n", brand);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume,
          MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }


  //helper method always private
  private boolean verifyInternetConnection() {
    return true;
  }

  //toString()
  @Override
  public String toString() {
    return "com.entertainment.Television{" +
        "brand='" + brand + '\'' +
        ", volume=" + volume + ", display type=" + display +
        '}';
  }
}
