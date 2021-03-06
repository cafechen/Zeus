package org.twelveolympians.zeus.basic.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.twelveolympians.zeus.basic.dao.ProductMapper;
import org.twelveolympians.zeus.basic.entity.param.ProductQueryParam;
import org.twelveolympians.zeus.basic.entity.po.Product;
import org.twelveolympians.zeus.basic.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;

import java.util.List;

@Service
@Slf4j
@RefreshScope
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Value("${producer.product:123}")
    private String value;

    @Override
    public boolean add(Product product) {
        return this.save(product);
    }

    @Override
    @CacheInvalidate(name = "product::", key = "#id")
    public boolean delete(String id) {
        return this.removeById(id);
    }

    @Override
    @CacheInvalidate(name = "product::", key = "#user.id")
    public boolean update(Product product) {
        return this.updateById(product);
    }

    @Override
    @Cached(name = "product::", key = "#id", cacheType = CacheType.BOTH)
    public Product get(String id) {
        log.info("value:{}", value);
        return this.getById(id);
    }

    @Override
    public List<Product> query(ProductQueryParam productQueryParam) {
        QueryWrapper<Product> queryWrapper = productQueryParam.build();
        queryWrapper.eq("name", productQueryParam.getName());
        return this.list(queryWrapper);
    }
}
