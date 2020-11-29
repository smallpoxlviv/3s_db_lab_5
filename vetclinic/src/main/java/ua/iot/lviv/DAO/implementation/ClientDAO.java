package ua.iot.lviv.DAO.implementation;

import ua.iot.lviv.model.ClientEntity;

public class ClientDAO extends GeneralDAOImpl<ClientEntity, Long> {

    @Override
    public final Class<ClientEntity> getClazz() {
        return ClientEntity.class;
    }
}
