package com.demo.dao;

import com.demo.entity.Test;
import org.apache.ibatis.annotations.Param;

//import
/**
 * Created by bao on 17/8/3.
 */
public interface TestDao {
    public Test getBy(@Param("id") Long id);
}
