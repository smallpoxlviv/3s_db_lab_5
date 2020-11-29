package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.DoctorDAO;
import ua.iot.lviv.model.DoctorEntity;

public class DoctorService extends GeneralServiceImpl<DoctorEntity, Long> {
    private final GeneralDAO<DoctorEntity, Long> doctorDAO = new DoctorDAO();

    @Override
    public GeneralDAO<DoctorEntity, Long> getDAO() {
        return doctorDAO;
    }
}


