/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author nguyenha
 * @param <T>
 */
public interface DAO<T> {

    Optional<T> get(int id);

    List<T> getAll(String key);

    void save(T t);

    void update(T t, String[] params);


}

