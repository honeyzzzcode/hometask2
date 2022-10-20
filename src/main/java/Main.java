public class Main {
    public static void main(String[] args) {
        Car myHybrid = new Car(30); // 30 km per litre

        myHybrid.addFuel(20); // Tank 20 litres

        myHybrid.drive(100); // Drive 100 km

        System.out.println("Remaining fuel :" + myHybrid.getFuelLevel());//Print fuel remaining


    }
}
