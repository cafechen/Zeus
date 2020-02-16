package org.twelveolympians.zeus.auth.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.twelveolympians.zeus.auth.entity.po.Product;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}