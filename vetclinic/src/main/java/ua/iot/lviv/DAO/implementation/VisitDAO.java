package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.VisitEntity;

public class VisitDAO extends GeneralDAOImpl<VisitEntity, Long> {

    @Override
    public final Class<VisitEntity> getClazz() {
        return VisitEntity.class;
    }
}