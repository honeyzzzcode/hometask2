public class Car {
    private int  FuelConsumtion = 0;
    private int Tank ;
    public int getFuelConsumtion() { return FuelConsumtion; }
    public int getTank() { return Tank; }
    public void setTank(int tank) { Tank = tank; }
    public Car(int fuelConsumtion) { FuelConsumtion = fuelConsumtion; }

    public void drive ( int kilometers){

        int result = ( kilometers  / getFuelConsumtion()) ;
         setTank( getTank() - result);
        System.out.println( "Fuel used while driving : "+result);
    }
    public void addFuel ( int litres){
        int result = getTank() + litres;
        setTank(result);
        System.out.println("Added fuel : " + getTank());
    }
    public int getFuelLevel () {

        return getTank();
    }

}
