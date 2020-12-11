package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.DiagnosisEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.DiagnosisService;

public class DiagnosisController extends GeneralControllerImpl<DiagnosisEntity, Long> {
    final GeneralService<DiagnosisEntity, Long> service = new DiagnosisService();

    @Override
    public GeneralService<DiagnosisEntity, Long> getService() {
        return service;
    }
}
