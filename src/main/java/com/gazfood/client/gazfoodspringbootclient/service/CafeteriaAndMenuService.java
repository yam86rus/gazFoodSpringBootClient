package com.gazfood.client.gazfoodspringbootclient.service;


import com.gazfood.client.gazfoodspringbootclient.entity.CafeteriaAndMenu;

import java.util.List;


public interface CafeteriaAndMenuService {

    List<CafeteriaAndMenu> getAllCafeteriaAndMenu();

    void savaCafeteriaAndMenu(CafeteriaAndMenu cafeteriaAndMenu);

    CafeteriaAndMenu getCafeteriaAndMenu(int id);

    void deleteCafeteriaAndMenu(int id);

    long getCountCafeteriaAndMenu();
}
