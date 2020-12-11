package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.DoctorEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.DoctorService;

public class DoctorController extends GeneralControllerImpl<DoctorEntity, Long> {
    final GeneralService<DoctorEntity, Long> service = new DoctorService();

    @Override
    public GeneralService<DoctorEntity, Long> getService() {
        return service;
    }
}

