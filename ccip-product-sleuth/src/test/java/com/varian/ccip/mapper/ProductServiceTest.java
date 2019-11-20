package com.varian.ccip.mapper;

import com.varian.ccip.ProductSleuthApp;
import com.varian.ccip.service.IProductService;
import com.varian.ccip.vo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = ProductSleuthApp.class)
@RunWith(SpringRunner.class)
public class ProductServiceTest {
    @Resource
    private IProductService iProductService;
    @Test
    public void testGet() {
        System.out.println(iProductService.get(1));
    }
    @Test
    public void testAdd() {
        Product dept = new Product() ;
        dept.setProductName("bob-" + System.currentTimeMillis());
        System.out.println(iProductService.add(dept));
    }
    @Test
    public void testList() {
        System.out.println(iProductService.list());
    }

}
