package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.VisitEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.VisitService;

public class VisitController extends GeneralControllerImpl<VisitEntity, Long> {
    final GeneralService<VisitEntity, Long> service = new VisitService();

    @Override
    public GeneralService<VisitEntity, Long> getService() {
        return service;
    }
}