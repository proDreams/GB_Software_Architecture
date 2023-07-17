package HW_4.Core;

import HW_4.ClientApplication.Authentication;
import HW_4.Interfaces.ICarrierRepo;
import HW_4.Interfaces.ICashRepo;
import HW_4.Interfaces.ICustomer;
import HW_4.Models.BankAccount;
import HW_4.Models.Carrier;
import HW_4.Models.Ticket;
import HW_4.Models.User;
import HW_4.Services.CarrierRepository;
import HW_4.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider implements ICarrierRepo, ICashRepo {
    private long cardNumber;
    private boolean isAuthorized;
    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;


    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
//        this.cardNumber = cardNumber;
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    @Override
    public Carrier read(int id) {
        return null;
    }

    @Override
    public boolean transaction(int payment, long cardFrom, long cardTo) {
        return false;
    }


    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) throws RuntimeException {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
        try {
            client = Authentication.authentication(new Customer().getUserProvider(), client.getUserName(), client.getHashPassword());
            isAuthorized = true;
            cardNumber = client.getCardNumber();
        } catch (RuntimeException e) {
            isAuthorized = false;
        }
    }
}
