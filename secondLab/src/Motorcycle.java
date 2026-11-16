public class Motorcycle extends Vehicle {
    private boolean hasSideсar;

    public Motorcycle(boolean hasSideсar, String model, String brand, int year,
                      String power, String type) {
        super(model, brand, year, power, type);
        this.hasSideсar = hasSideсar;
    }

    @Override
    public void move() {
        System.out.println("На этом байке " + getBrand() + " можно прокатиться с ветерком " + (hasSideсar ? "с девушкой" : "одному"));
    }

    public void doWheelie() {
        System.out.println("УИЛИИ!!! БЖЖЖЖ!!");
    }
}
