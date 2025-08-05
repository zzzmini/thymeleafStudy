package com.my.thymeleftTest.controller;

import com.my.thymeleftTest.dto.Product;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping("info")
    public String login(Model model) {
        String url = "/product";
        Product cola = new Product();
        cola.setName("콜라");
        cola.setPrice(1000);
        cola.setStock(10);
        Product cyder = new Product("사이다", 1200, 7);

        // 리스트에 담는다.
        List<Product> products = new ArrayList<>();

        products.add(cola);
        products.add(cyder);
        model.addAttribute("products", products);
        url = url + "/product_info";
        return url;
    }
}
