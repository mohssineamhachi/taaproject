package fr.istic.taa.dao;

import java.io.Serializable;

public interface GenericDao<T, PK extends Serializable> {
    T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
    }