package com.archana.jparealtime.springbootjpamysqlrealtimeapp1.repository;

import com.archana.jparealtime.springbootjpamysqlrealtimeapp1.model.Product;

import java.util.List;

public class ProductJpaRepository implements ProductDAO {

    @Override
    public void insert(Product product) {

    }

    @Override
    public List<Product> fetch(Product product) {
        return null;
    }

    @Override
    public Product findById(Long Id) {
        return null;
    }
}
