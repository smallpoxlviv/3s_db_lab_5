package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.DoctorEntity;

public class DoctorDAO extends GeneralDAOImpl<DoctorEntity, Long> {

    @Override
    public final Class<DoctorEntity> getClazz() {
        return DoctorEntity.class;
    }

}