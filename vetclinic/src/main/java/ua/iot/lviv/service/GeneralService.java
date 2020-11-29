package ua.iot.lviv.service;

import ua.iot.lviv.DAO.GeneralDAO;

import java.util.List;

public interface GeneralService<T, ID> {
    List<T> getAll();
    T getById(ID id);
    void create(T entity);
    void update(T entity);
    void delete(ID id);

    GeneralDAO<T, ID> getDAO();
}
