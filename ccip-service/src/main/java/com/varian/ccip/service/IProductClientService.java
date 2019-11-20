package com.varian.ccip.service;

import com.varian.ccip.config.FeignClientConfig;
import com.varian.ccip.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "CCIP-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService {
    @RequestMapping("/product/get/{id}")
    public Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/product/list")
    public List<Product> listProduct() ;

    @RequestMapping("/product/add")
    public boolean addPorduct(Product product) ;
}
