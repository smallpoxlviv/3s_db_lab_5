package ua.iot.lviv.controller;

import ua.iot.lviv.service.GeneralService;


public interface GeneralController<T, ID> {
    void getAll();
    void getById(ID id);
    void create(T entity);
    void update(T entity);
    void delete(ID id);

    GeneralService<T, ID> getService();
    T getEntityById(ID id);
}