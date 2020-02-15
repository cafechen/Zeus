package org.twelveolympians.zeus.basic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.twelveolympians.zeus.basic.entity.po.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}