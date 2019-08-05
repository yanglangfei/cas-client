package com.yanglf.cas.casclient1.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglf
 * @description
 * @since 2019/8/5
 **/
@RestController
public class IndexContoller {

    @RequestMapping("/")
    public String index() {
        return "success";
    }


}
