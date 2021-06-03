package com.gazfood.client.gazfoodspringbootclient.dao;

import com.gazfood.client.gazfoodspringbootclient.entity.PriceCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceCategoryRepository extends JpaRepository<PriceCategory, Integer> {
}
