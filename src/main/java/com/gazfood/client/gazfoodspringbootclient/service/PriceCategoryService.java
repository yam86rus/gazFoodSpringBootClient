package com.gazfood.client.gazfoodspringbootclient.service;


import com.gazfood.client.gazfoodspringbootclient.entity.PriceCategory;

import java.util.List;

public interface PriceCategoryService {
    List<PriceCategory> getAllPriceCategories();

    void savePriceCategory(PriceCategory priceCategory);

    PriceCategory getPriceCategory(int id);

    void deletePriceCategory(int id);

    long getCountPriceCategories();

}
