package com.gazfood.client.gazfoodspringbootclient.dao;

import com.gazfood.client.gazfoodspringbootclient.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
