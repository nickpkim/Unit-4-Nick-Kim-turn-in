import java.text.DecimalFormat;
public class Car{
  private DecimalFormat fmt = new DecimalFormat(".00");
  private String make;
  private String model;
  private double mpg;
  private double gallons;
  private double maxGallons;
  private double milesLeft;
  private boolean outOfGas;

  public Car(String carMake, String carModel, double carMPG, double carMaxGallons, double carGallons){
    make = carMake;
    model = carModel;
    mpg = carMPG;
    maxGallons = carMaxGallons;
    gallons = carGallons;
    milesLeft = carMPG*carGallons;
    if (carGallons == 0) outOfGas = true;
    else outOfGas = false;
  }

  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }
  public double getMPG(){
    return mpg;
  }
  public double getMaxGallons(){
    return maxGallons;
  }
  public double getGallons(){
    return gallons;
  }
  public double getMilesLeft(){
    return milesLeft;
  }
  public boolean getOutOfGas(){
    return outOfGas;
  }
  public void setGallons(double newGallons){
    gallons = newGallons;
    milesLeft = mpg*newGallons;
    if (gallons == 0) outOfGas = true;
    else outOfGas = false;
  }
  public void addGallons(double addedGallons){
    gallons += addedGallons;
    milesLeft = mpg*gallons;
    if (gallons > maxGallons){
      outOfGas = true;
      System.out.println("Overfueled.");
    }
  }

  public void drive(double miles){
    gallons -= miles/mpg;
    milesLeft = mpg*gallons;
    if (gallons <= 0) outOfGas = true;
  }

  public String toString(){
    String result = "";
    result += make+"\n";
    result += model+"\n";
    result += mpg+" mpg"+"\n";
    result += fmt.format(gallons)+" gallons"+"\n";
    return result;
  }
}
