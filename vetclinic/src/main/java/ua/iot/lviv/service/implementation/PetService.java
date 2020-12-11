package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.PetDAO;
import ua.iot.lviv.model.PetEntity;

public class PetService  extends GeneralServiceImpl<PetEntity, Long> {
    private final GeneralDAO<PetEntity, Long> DAO = new PetDAO();

    @Override
    public GeneralDAO<PetEntity, Long> getDAO() {
        return DAO;
    }
}


