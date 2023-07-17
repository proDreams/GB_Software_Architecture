package HW_3;

import java.awt.*;

/**
 * Класс описывающий автомобиль Lada Vesta унаследованный от абстрактного класса Car и имплементирующий интерфейс iGasStation
 */
public class Vesta extends Car implements iGasStation {
    private final iGasStation gasStation;

    /**
     * Конструктор конкретного автомобиля
     *
     * @param brand            - бренд автомобиля
     * @param model            - модель автомобиля
     * @param color            - цвет автомобиля
     * @param bodyType         - тип кузова автомобиля
     * @param wheelsCount      - количество колёс у автомобиля
     * @param fuelType         - тип топлива автомобиля
     * @param transmissionType - тип коробки передач автомобиля
     * @param engineCapacity   - объем двигателя в автомобиле
     * @param gasStation       - объект интерфейса заправочной станции
     */
    public Vesta(String brand, String model, Color color, String bodyType, int wheelsCount, String fuelType, String transmissionType, float engineCapacity, iGasStation gasStation) {
        super(brand, model, color, bodyType, wheelsCount, fuelType, transmissionType, engineCapacity);
        this.gasStation = gasStation;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void service() {
        super.service();
    }

    @Override
    public void gearShifting() {
        super.gearShifting();
    }

    @Override
    public void turnLights() {
        super.turnLights();
    }

    @Override
    public void turnWipers() {
        super.turnWipers();
    }


    @Override
    public void refill() {
        gasStation.refill();
    }
}
