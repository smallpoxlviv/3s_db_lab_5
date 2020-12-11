package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.ScheduleDAO;
import ua.iot.lviv.model.ScheduleEntity;


public class ScheduleService extends GeneralServiceImpl<ScheduleEntity, Long> {
    private final GeneralDAO<ScheduleEntity, Long> clientDAO = new ScheduleDAO();

    @Override
    public GeneralDAO<ScheduleEntity, Long> getDAO() {
        return clientDAO;
    }
}


