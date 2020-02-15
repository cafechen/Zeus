package org.twelveolympians.zeus.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.twelveolympians.zeus.basic.entity.po.Product;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}