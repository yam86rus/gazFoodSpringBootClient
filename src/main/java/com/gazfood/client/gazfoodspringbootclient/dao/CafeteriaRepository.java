package com.gazfood.client.gazfoodspringbootclient.dao;

import com.gazfood.client.gazfoodspringbootclient.entity.Cafeteria;
import com.gazfood.client.gazfoodspringbootclient.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

public interface CafeteriaRepository extends JpaRepository<Cafeteria, Integer> {

    @Query(value = "SELECT * FROM menu", nativeQuery = true)
    List<Menu> findAllMenu();

    @Query(value = "select d.name, m.price from menu_list\n" +
            "join menu m on menu_list.id = m.menuList_id\n" +
            "join cafeteria_and_menu cam on menu_list.id = cam.menuList_id\n" +
            "join dishes d on d.id = m.dishes_id\n" +
            "where cafeteria_id=1", nativeQuery = true)
    List<Object[]> findThis();

}
