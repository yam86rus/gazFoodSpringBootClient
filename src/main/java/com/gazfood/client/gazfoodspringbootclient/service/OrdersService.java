package com.gazfood.client.gazfoodspringbootclient.service;

import com.gazfood.client.gazfoodspringbootclient.entity.Orders;

import java.util.List;

public interface OrdersService {

    List<Orders> getAllOrders();

    void saveOrders(Orders orders);

    Orders getOrders(int id);

    void deleteOrders(int id);

}
