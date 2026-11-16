public class Truck extends Vehicle {
    private double maxLoad; // тонн

    public Truck(double maxLoad,  String model, String brand, int year,
                 int power, String type) {
        super(model, brand, year, power, type);
        this.maxLoad = maxLoad;
    }

    @Override
    public void move() {
        System.out.println("Грузовик " + getBrand() + " фигачит по трассе с грузом " + maxLoad);
    }

    public void loadCargo(double weight) {
        if (weight <= maxLoad) {
            System.out.println("Загружено " + weight + " осталось " + maxLoad);
        } else {
            System.out.println("А все, нет больше места, ты суешь " + weight + " в " + maxLoad);
        }
    }
}
