package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.ScheduleEntity;

public class ScheduleDAO extends GeneralDAOImpl<ScheduleEntity, Long> {

    @Override
    public final Class<ScheduleEntity> getClazz() {
        return ScheduleEntity.class;
    }
}