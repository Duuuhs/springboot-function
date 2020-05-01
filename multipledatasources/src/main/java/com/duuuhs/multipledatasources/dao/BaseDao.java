package com.duuuhs.multipledatasources.dao;

import java.util.List;

/**
 * @author Duuuhs
 * @description
 * @create 2020/4/29 23:08
 */
public interface BaseDao<T> {

    void insert(T entity) throws Exception;


    int insertBatch(List<T> entityList) throws Exception;


    void update(T entity) throws Exception;


    void deleteByPrimaryKey(int id) throws Exception;


    void delete(T entity) throws Exception;


    T findByPrimaryKey(int id);


    T findByEntity(T entity);



    List<T> findByListEntity(T entity);


    List<T> findAll();


    Object findByObject(Object obj);
}
