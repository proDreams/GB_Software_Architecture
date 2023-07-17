package HW_3;

/**
 * Класс дизельного топлива имплементированный от интерфейса iGasStation
 */
public class Diesel implements iGasStation {
    @Override
    public void refill() {
        System.out.println("Заправка дизелем");
    }
}
