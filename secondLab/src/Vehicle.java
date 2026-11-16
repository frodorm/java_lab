public abstract class Vehicle {
    private String model;
    private String brand;
    private int year;
    private Engine engine;

    public Vehicle(String model, String brand, int year, String power, String type) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engine = new Engine(power, type);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public final void getInfo() {
        System.out.println(brand + " " + model + " " + year + " " + engine.getType());
    }

    public abstract void move();

    public class Engine {
        private String type;
        private String power;

        public Engine(String type, String power) {
            this.type = type;
            this.power = power;
        }

        public String getType() {
            return type;
        }

        public String getPower() {
            return power;
        }
    }
}
