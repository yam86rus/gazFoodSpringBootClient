package com.gazfood.client.gazfoodspringbootclient.service;


import com.gazfood.client.gazfoodspringbootclient.entity.MenuList;

import java.util.List;

public interface MenuListService {
    List<MenuList> getAllMenuLists();

    void saveMenuList(MenuList menuList);

    MenuList getMenuList(int id);

    void deleteMenuList(int id);

    long getCountMenuList();
}
