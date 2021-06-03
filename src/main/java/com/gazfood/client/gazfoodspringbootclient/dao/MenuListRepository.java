package com.gazfood.client.gazfoodspringbootclient.dao;

import com.gazfood.client.gazfoodspringbootclient.entity.MenuList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuListRepository extends JpaRepository<MenuList, Integer> {
}
