package lab1Classes;

public class Car {
    private String carId;
    private String modelName;

    public Car(String carId, String modelName) {
        this.carId = carId;
        this.modelName = modelName;
    }

    public Car() {}

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

}
