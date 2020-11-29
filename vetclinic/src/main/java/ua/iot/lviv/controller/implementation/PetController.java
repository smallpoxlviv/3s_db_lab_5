package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.PetEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.PetService;

public class PetController extends GeneralControllerImpl<PetEntity, Long> {
    final GeneralService<PetEntity, Long> service = new PetService();

    @Override
    public GeneralService<PetEntity, Long> getService() {
        return service;
    }
}

