package com.ead.productservice.controller;

import com.ead.productservice.dto.productRequest;
import com.ead.productservice.dto.productResponse;
import com.ead.productservice.service.productService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class productController {
    private final  productService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody productRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<productResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
