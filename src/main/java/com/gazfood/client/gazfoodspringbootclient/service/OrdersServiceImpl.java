package com.gazfood.client.gazfoodspringbootclient.service;

import com.gazfood.client.gazfoodspringbootclient.dao.OrdersRepository;
import com.gazfood.client.gazfoodspringbootclient.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> getAllOrders = ordersRepository.findAll();
        return getAllOrders;
    }

    @Override
    public void saveOrders(Orders orders) {
        ordersRepository.save(orders);
    }

    @Override
    public Orders getOrders(int id) {
        Orders orders = null;
        Optional<Orders> optional = ordersRepository.findById(id);
        if (optional.isPresent()) {
            orders = optional.get();
        }
        return orders;
    }

    @Override
    public void deleteOrders(int id) {
        ordersRepository.deleteById(id);
    }
}
