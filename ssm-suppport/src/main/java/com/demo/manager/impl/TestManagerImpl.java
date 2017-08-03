package com.demo.manager.impl;

import com.demo.dao.TestDao;
import com.demo.entity.Test;
import com.demo.manager.TestManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by bao on 17/8/3.
 */
@Component
public class TestManagerImpl implements TestManager {
    @Autowired
    private TestDao testDao;

    @Override
    public Test getBy(Long id) {
        return testDao.getBy(id);
    }
}
