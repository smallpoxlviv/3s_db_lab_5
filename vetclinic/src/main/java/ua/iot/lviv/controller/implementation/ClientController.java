package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.ClientEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.ClientService;

public class ClientController extends GeneralControllerImpl<ClientEntity, Long> {
    final GeneralService<ClientEntity, Long> service = new ClientService();

    @Override
    public GeneralService<ClientEntity, Long> getService() {
        return service;
    }
}
