package com.gazfood.client.gazfoodspringbootclient.controllers;

import com.gazfood.client.gazfoodspringbootclient.entity.BooksCreationDto;
import com.gazfood.client.gazfoodspringbootclient.entity.Cafeteria;
import com.gazfood.client.gazfoodspringbootclient.entity.Menu;
import com.gazfood.client.gazfoodspringbootclient.entity.Orders;
import com.gazfood.client.gazfoodspringbootclient.service.CafeteriaService;
import com.gazfood.client.gazfoodspringbootclient.service.MenuService;
import com.gazfood.client.gazfoodspringbootclient.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    private CafeteriaService cafeteriaService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/")
    public String showMainPage(Model model) {
        List<Cafeteria> allCafeterias = cafeteriaService.getAllCafeterias().stream()
                .filter(e -> e.isActive() == true)
                .collect(Collectors.toList());
        model.addAttribute("allCafeterias", allCafeterias);
        return "index";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("task") String task, Model model) {
        System.out.println(task);
        model.addAttribute("task", task);

        List<Menu> AllMenu = menuService.getAllMenus();
        model.addAttribute("AllMenu", AllMenu);
        System.out.println(AllMenu);

        List<Object[]> res = cafeteriaService.findThis();
        List<String> list = new ArrayList<>();

        for (Object[] result : res) {
            list.add(String.valueOf(Arrays.stream(result).collect(Collectors.toList())));
            System.out.println();
        }
        System.out.println(list);

        model.addAttribute("list", list);
        return "show-details";
    }

    @RequestMapping("/search")
    public String search(
            @ModelAttribute("selectedOption") Cafeteria selectedOption) {
        System.out.println(selectedOption.getId());
        return "search";
    }

    @RequestMapping("addOrder")
    public String addNewOrder(Model model) {

        Orders orders = new Orders();
        model.addAttribute("orders", orders);

        List<Menu> allMenu = menuService.getAllMenus();
        model.addAttribute("allMenu", allMenu);

        return "form-order";
    }

    @RequestMapping("/allOrders")
    public String showAllOrders(Model model) {
        List<Orders> allOrders = ordersService.getAllOrders();
        model.addAttribute("allOrders", allOrders);
        return "all-orders";
    }

    @RequestMapping("/saveOrder")
    public String saveOrder(Orders orders) {
        orders.setData(LocalDate.now());
        orders.setCafeteriaName("Тестовая столовая");
        ordersService.saveOrders(orders);
        return "redirect:allOrders";
    }
}
