package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.PetEntity;

public class PetDAO extends GeneralDAOImpl<PetEntity, Long> {

    @Override
    public final Class<PetEntity> getClazz() {
        return PetEntity.class;
    }
}
