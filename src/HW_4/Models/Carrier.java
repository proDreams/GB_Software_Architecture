package HW_4.Models;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
