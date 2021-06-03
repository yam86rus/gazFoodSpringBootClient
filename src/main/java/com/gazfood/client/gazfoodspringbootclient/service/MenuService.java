package com.gazfood.client.gazfoodspringbootclient.service;

import com.gazfood.client.gazfoodspringbootclient.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getAllMenus();

    void saveMenu(Menu menu);

    Menu getMenu(int id);

    void deleteMenu(int id);

    long getCountMenus();



}
