package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.ServiceEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.ServiceService;

public class ServiceController extends GeneralControllerImpl<ServiceEntity, Long> {
    final GeneralService<ServiceEntity, Long> service = new ServiceService();

    @Override
    public GeneralService<ServiceEntity, Long> getService() {
        return service;
    }
}