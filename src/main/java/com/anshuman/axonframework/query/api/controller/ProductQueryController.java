package com.anshuman.axonframework.query.api.controller;

import com.anshuman.axonframework.command.api.model.ProductRestModel;
import com.anshuman.axonframework.query.api.queries.GetProductsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductQueryController {
    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("/findAll")
    public List<ProductRestModel> getAllProducts() {
        GetProductsQuery getProductsQuery = new GetProductsQuery();
        return queryGateway.query(getProductsQuery, ResponseTypes.multipleInstancesOf(ProductRestModel.class))
                .join();
    }
}
