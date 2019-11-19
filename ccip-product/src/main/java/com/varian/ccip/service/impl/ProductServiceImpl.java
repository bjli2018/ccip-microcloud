package com.varian.ccip.service.impl;

import com.varian.ccip.mapper.ProductMapper;
import com.varian.ccip.service.IProductService;
import com.varian.ccip.vo.Product;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements IProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.findById(id);
    }

    @Override
    public boolean add(Product product) {
        return productMapper.create(product);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
