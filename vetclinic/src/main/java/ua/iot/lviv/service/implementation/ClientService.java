package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.ClientDAO;
import ua.iot.lviv.model.ClientEntity;


public class ClientService extends GeneralServiceImpl<ClientEntity, Long> {
    private final GeneralDAO<ClientEntity, Long> clientDAO = new ClientDAO();

    @Override
    public GeneralDAO<ClientEntity, Long> getDAO() {
        return clientDAO;
    }
}
