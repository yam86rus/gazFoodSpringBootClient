package com.gazfood.client.gazfoodspringbootclient.service;

import com.gazfood.client.gazfoodspringbootclient.entity.Cafeteria;
import com.gazfood.client.gazfoodspringbootclient.entity.Menu;

import java.util.List;
import java.util.Objects;

public interface CafeteriaService {
    List<Cafeteria> getAllCafeterias();

    void saveCafeteria(Cafeteria cafeteria);

    Cafeteria getCafeteria(int id);

    void deleteCafeteria(int id);

    List<Menu> getAllMenu();

    List<Object[]> findThis();


}
