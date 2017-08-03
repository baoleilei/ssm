package com.demo.service.impl;

import com.demo.entity.Test;
import com.demo.manager.TestManager;
import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bao on 17/8/3.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestManager testManager;
    @Override
    public Test getBy(Long id) {
        return testManager.getBy(id);
    }
}
