package com.demo;

import com.demo.entity.Test;
import com.demo.manager.TestManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bao on 17/8/3.
 */
@RestController
public class page {

    @Autowired
    private TestManager testManager;
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        String a  = testManager.getBy(0L).getTest();
        return   a;
    }
}
