public class Car extends Vehicle {
    private int passangerCount;

    public Car(int passangerCount, String model, String brand, int year,
               String power, String type) {
        super(model, brand, year, power, type);
        this.passangerCount = passangerCount;
    }

    @Override
    public void move() {
        System.out.println("Эта тачка - " + getBrand() + " может довезти " + passangerCount + " человек, " +
                "а если постараться " + (passangerCount + 1));
    }

    public void openTrunk() {
        System.out.println("Теперь можно довезти еще и вещи этих " + passangerCount + " человек");
    }
}
