package com.example.eurekaprovider.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxl
 * @date 2019-09-12
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @ApiOperation(value = "根据主键id查询book信息")
    @ApiImplicitParam(name = "id", value = "book表的主键id", required = true, dataType = "String", paramType = "path")
    @GetMapping("/{id}")
    public String selectOne(@PathVariable("id") String id) {
        return "query success, message from eureka provider";
    }
}
