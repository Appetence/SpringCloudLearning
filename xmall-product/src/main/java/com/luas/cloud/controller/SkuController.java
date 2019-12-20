package com.luas.cloud.controller;

import cn.hutool.core.map.MapUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sku")
public class SkuController {

    @RequestMapping("/{skuId}")
    public Object get(@PathVariable("skuId") String skuId) {
        return MapUtil.<String, Object>builder()
                .put("skuId", skuId)
                .put("name", "笔记本电脑")
                .put("price", 1199.00)
                .build();
    }

}
