package ua.iot.lviv.service.implementation;


import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.service.GeneralService;

import java.util.List;

public abstract class GeneralServiceImpl<T, ID> implements GeneralService<T, ID> {

    @Override
    public abstract GeneralDAO<T, ID> getDAO();

    @Override
    public final List<T> getAll() {
        return getDAO().getAll();
    }

    @Override
    public final T getById(final ID id) {
        return getDAO().getById(id);
    }

    @Override
    public final void create(final T entity) {
        getDAO().create(entity);
    }

    @Override
    public final void update(final T entity) {
        getDAO().update(entity);
    }

    @Override
    public final void delete(final ID id) {
        getDAO().delete(id);
    }

}