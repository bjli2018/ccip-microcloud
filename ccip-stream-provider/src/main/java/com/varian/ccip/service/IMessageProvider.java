package com.varian.ccip.service;

import com.varian.ccip.vo.Product;

public interface IMessageProvider {
    void send(Product product);
}
