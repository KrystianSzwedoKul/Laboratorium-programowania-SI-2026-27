package lab3;

public class Car implements Operacje {
    private String marka;
    private String model;
    private double spalanie;

    public Car(String marka,
               String model,
               double spalanie) {
        this.marka = marka;
        this.model = model;
        this.spalanie = spalanie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getModel() {
        return model;
    }

    public double getSpalanie() {
        return spalanie;
    }

    @Override
    public void start() {
        System.out.println("Samochód marki " + marka + " ruszył");
    }

    @Override
    public void stop() {
        System.out.println("Samochód marki " + marka + " zatrzymał się");
    }

    @Override
    public String getInformacje() {
        return " Model: " + model
                + " Marka: " + marka
                + " Spalanie: " + spalanie;
    }
}
