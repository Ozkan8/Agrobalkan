package com.agrobalkan.service;

import com.agrobalkan.model.ProductType;
import javafx.print.Collation;

import java.util.Collection;
import java.util.List;

public interface ProductTypeService extends BaseEntityService<ProductType> {

    public Collection<ProductType> findAll();

    public Long count();
}
