package com.varian.ccip.controller;

import com.varian.ccip.service.IProductService;
import com.varian.ccip.vo.Product;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {
    public static final String PATIENT_GET_URL = "http://CCIP-PATIENT-SLEUTH/patient/getPatient/";
    @Resource
    private IProductService iProductService;
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @Resource
    private DiscoveryClient client ; // 进行Eureka的发现服务

    @RequestMapping(value="/get/{id}")
    public Object get(@PathVariable("id") long id) {
        String result = restTemplate.exchange(PATIENT_GET_URL, HttpMethod.GET,new HttpEntity<Object>(httpHeaders), String.class).getBody();
        System.out.println("result="+result);
        return this.iProductService.get(id) ;
    }
    @RequestMapping(value="/add")
    public Object add(@RequestBody Product product) {
        return this.iProductService.add(product) ;
    }
    @RequestMapping(value="/list")
    public Object list() {
        return this.iProductService.list() ;
    }
    @RequestMapping("/discover")
    public Object discover() { // 直接返回发现服务信息
        return this.client ;
    }
}
