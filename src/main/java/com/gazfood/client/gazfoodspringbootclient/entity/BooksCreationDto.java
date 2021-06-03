package com.gazfood.client.gazfoodspringbootclient.entity;

import java.util.List;

public class BooksCreationDto {
    private List<Orders> ordersList;

    public void addOrder(Orders orders) {
        this.ordersList.add(orders);
    }


    public BooksCreationDto(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public BooksCreationDto() {
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }
}
