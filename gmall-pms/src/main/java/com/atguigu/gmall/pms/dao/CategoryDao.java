package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author caihognhao
 * @email xxxxxxx@caihognhao.com
 * @date 2020-03-23 15:26:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
