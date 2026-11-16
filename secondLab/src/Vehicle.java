public abstract class Vehicle {
    private String model;
    private String brand;
    private int year;
    private Fuel fuel;

    public Vehicle(String model, String brand, int year, String recomendedFuelBrand, String fuelType) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.fuel = new Fuel(recomendedFuelBrand, fuelType);
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

    public Fuel getFuel() {
        return fuel;
    }

    public final void getInfo() {
        System.out.println(brand + " " + model + " " + year + " " + fuel.getFuelType());
    }

    public abstract void move();

    public class Fuel {
        private String fuelBrand;
        private String fuelType;

        public Fuel(String fuelBrand, String fuelType) {
            this.fuelBrand = fuelBrand;
            this.fuelType = fuelType;
        }

        public String getFuelType() {
            return fuelType;
        }

        public String getFuelBrand() {
            return fuelBrand;
        }
    }
}
