class VehicleDriver
{
  public static void main(String[] args)
  {
    Vehicle v = new Bike();
	Bike b = (Bike)v;
    System.out.println(b.getNoOfWheels());
    System.out.println(b.getPrice());
	System.out.println(b.getName());
	System.out.println(b.getCharacter);
  }
}