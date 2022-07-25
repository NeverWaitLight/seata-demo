package com.example.at.business.controller;

import com.example.at.business.client.OrderClient;
import com.example.at.business.client.StorageClient;
import com.example.at.business.client.WalletClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.example.xa.commons.Ordering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {

    @Autowired
    private OrderClient orderClient;
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private WalletClient walletClient;


    @GlobalTransactional
    @RequestMapping(path = "/ordering", method = {RequestMethod.POST, RequestMethod.PUT})
    public void order(@RequestBody Ordering ordering) {
        walletClient.pay(ordering.getUsername(), ordering.getBill());
        storageClient.reduce(ordering.getProductId(), ordering.getAmount());
        orderClient.create(ordering);
    }

}
