package ua.iot.lviv.DAO.implementation;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ua.iot.lviv.DAO.GeneralDAO;
import ua.iot.lviv.persistence.ConnectionManager;

import java.io.Serializable;
import java.util.List;

public abstract class GeneralDAOImpl<T, ID> implements GeneralDAO<T, ID> {

    @Override
    public abstract Class<T> getClazz();

    @Override
    public final List<T> getAll() {
        Session session = ConnectionManager.getSession();
        final Query query = session.createQuery("from " + getClazz().getSimpleName());
        List<T> entities = query.list();
        return entities;
    }

    @Override
    public final T getById(final ID id) {
        Session session = ConnectionManager.getSession();
        T entity = (T) session.get(getClazz(), (Serializable) id);
        return entity;
    }

    @Override
    public final void create(final T entity) {
        Session session = ConnectionManager.getSession();
        try{
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public void update(final T entity) {
        Session session = ConnectionManager.getSession();
        try{
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public final void delete(final ID id) {
        Session session = ConnectionManager.getSession();
        try{
            session.beginTransaction();
            T entity = (T) session.get(getClazz(), (Serializable) id);
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw e;
        }
    }
}
