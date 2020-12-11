package ua.iot.lviv.DAO;

import java.util.List;

public interface GeneralDAO<T, ID> {
    List<T> getAll();
    T getById(ID id);
    void create(T entity);
    void update(T entity);
    void delete(ID id);

    Class<T> getClazz();
}
