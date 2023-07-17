package HW_3;

/**
 * Класс бензинового топлива имплементированный от интерфейса iGasStation
 */
public class Petrol implements iGasStation {
    @Override
    public void refill() {
        System.out.println("Заправка бензином");
    }
}
