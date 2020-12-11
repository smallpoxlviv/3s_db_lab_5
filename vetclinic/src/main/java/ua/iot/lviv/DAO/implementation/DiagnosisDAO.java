package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.DiagnosisEntity;

public class DiagnosisDAO extends GeneralDAOImpl<DiagnosisEntity, Long> {

    @Override
    public final Class<DiagnosisEntity> getClazz() {
        return DiagnosisEntity.class;
    }

}