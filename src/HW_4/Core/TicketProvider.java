package HW_4.Core;

import HW_4.Interfaces.ITicketRepo;
import HW_4.Models.Ticket;
import HW_4.Services.TicketRepository;

import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider implements ITicketRepo {
    private ITicketRepo ticketRepo;

    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    @Override
    public boolean create(Ticket ticket) {
        return false;
    }


    @Override
    public List<Ticket> readAll(int routeNumber) {
        return null;
    }

    @Override
    public boolean delete(Ticket ticket) {
        return false;
    }

    @Override
    public boolean update(Ticket ticket) {
        return false;
    }


    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */
    public List<Ticket> getTickets(int routeNumber) throws RuntimeException{
        return ticketRepo.readAll(routeNumber);
    }

    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        return ticket.getValid();
    }


}
