package com.gazfood.client.gazfoodspringbootclient.dao;

import com.gazfood.client.gazfoodspringbootclient.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
