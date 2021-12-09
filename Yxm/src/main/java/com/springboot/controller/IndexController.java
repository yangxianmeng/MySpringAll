package com.springboot.controller;

import com.springboot.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yxm
 **/
@RestController
public class IndexController {

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index() {
        return testConfigBean.toString();
    }
}
