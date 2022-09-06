public class Television {

  //declare instant variables or fields
  //type name
  //private
  private String brand;
  private int volume;

//write business methods
//public modifiers
  public void turnOn(){
    //boolean variable = (assign a value)
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on with a volume of " + volume);

  }
  public void turnOff(){
    System.out.println("The " + brand + " television is off! ");
  }

  public String getBrand() {
    return brand;
  }
//Accessor Methods
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  //helper method always private
  private boolean verifyInternetConnection(){
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
