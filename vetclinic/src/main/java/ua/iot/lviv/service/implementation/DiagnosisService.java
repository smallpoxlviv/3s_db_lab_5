package ua.iot.lviv.service.implementation;

import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.DAO.implementation.DiagnosisDAO;
import ua.iot.lviv.model.DiagnosisEntity;

public class DiagnosisService extends GeneralServiceImpl<DiagnosisEntity, Long> {
    private final GeneralDAO<DiagnosisEntity, Long> diagnosisDAO = new DiagnosisDAO();

    @Override
    public GeneralDAO<DiagnosisEntity, Long> getDAO() {
        return diagnosisDAO;
    }
}

