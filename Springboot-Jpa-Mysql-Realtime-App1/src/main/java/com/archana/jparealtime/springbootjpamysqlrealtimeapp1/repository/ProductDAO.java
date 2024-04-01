package com.archana.jparealtime.springbootjpamysqlrealtimeapp1.repository;

import com.archana.jparealtime.springbootjpamysqlrealtimeapp1.model.Product;

import java.util.List;

public interface ProductRepository {

    // inser
    void insert(Product product);
    //fetchAll product

    List<Product> fetch(Product product);

    // find byId
    Product findById(Long Id);

}
