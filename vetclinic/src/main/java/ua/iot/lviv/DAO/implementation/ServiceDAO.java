package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.ServiceEntity;

public class ServiceDAO extends GeneralDAOImpl<ServiceEntity, Long> {

    @Override
    public final Class<ServiceEntity> getClazz() {
        return ServiceEntity.class;
    }
}
