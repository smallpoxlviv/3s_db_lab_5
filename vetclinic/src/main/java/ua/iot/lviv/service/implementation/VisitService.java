package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.VisitDAO;
import ua.iot.lviv.model.VisitEntity;

public class VisitService extends GeneralServiceImpl<VisitEntity, Long> {
    private final GeneralDAO<VisitEntity, Long> clientDAO = new VisitDAO();

    @Override
    public GeneralDAO<VisitEntity, Long> getDAO() {
        return clientDAO;
    }
}


