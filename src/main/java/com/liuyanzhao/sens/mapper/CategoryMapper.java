package com.liuyanzhao.sens.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.liuyanzhao.sens.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuyanzhao
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 获得所有的菜单
     * @return
     */
    List<Category> findAll();
}

