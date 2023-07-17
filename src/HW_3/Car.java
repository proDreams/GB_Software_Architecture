package HW_3;

import java.awt.*;

/**
 * Абстрактный класс описывающий автомобиль
 */
public abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private String bodyType;
    private int wheelsCount;
    private String fuelType;
    private String transmissionType;
    private float engineCapacity;

    /**
     * Конструктор класса
     *
     * @param brand            - бренд автомобиля
     * @param model            - модель автомобиля
     * @param color            - цвет автомобиля
     * @param bodyType         - тип кузова автомобиля
     * @param wheelsCount      - количество колёс у автомобиля
     * @param fuelType         - тип топлива автомобиля
     * @param transmissionType - тип коробки передач автомобиля
     * @param engineCapacity   - объем двигателя в автомобиле
     */
    public Car(String brand, String model, Color color, String bodyType, int wheelsCount, String fuelType, String transmissionType, float engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelsCount = wheelsCount;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineCapacity = engineCapacity;
    }

    /**
     * Метод приводящий автомобиль в движение
     */
    public void move() {
    }

    /**
     * Метод постановки автомобиля на тех.обслуживание
     */
    public void service() {
    }

    /**
     * Метод переключения передачи
     */
    public void gearShifting() {
    }

    /**
     * Метод включения фар
     */
    public void turnLights() {
    }

    /**
     * Метод включения дворников
     */
    public void turnWipers() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
