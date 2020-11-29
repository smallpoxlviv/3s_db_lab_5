package ua.iot.lviv.controller.implementation;

import ua.iot.lviv.model.ScheduleEntity;
import ua.iot.lviv.service.GeneralService;
import ua.iot.lviv.service.implementation.ScheduleService;

public class ScheduleController extends GeneralControllerImpl<ScheduleEntity, Long> {
    final GeneralService<ScheduleEntity, Long> service = new ScheduleService();

    @Override
    public GeneralService<ScheduleEntity, Long> getService() {
        return service;
    }
}
