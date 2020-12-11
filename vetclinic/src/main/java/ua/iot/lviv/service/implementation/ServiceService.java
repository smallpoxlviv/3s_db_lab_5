package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.ServiceDAO;
import ua.iot.lviv.model.ServiceEntity;


public class ServiceService extends GeneralServiceImpl<ServiceEntity, Long> {
    private final GeneralDAO<ServiceEntity, Long> clientDAO = new ServiceDAO();

    @Override
    public GeneralDAO<ServiceEntity, Long> getDAO() {
        return clientDAO;
    }
}

