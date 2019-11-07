package com.varian.ccip.service;

import com.varian.ccip.vo.Product;

import java.util.List;

public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();

}
