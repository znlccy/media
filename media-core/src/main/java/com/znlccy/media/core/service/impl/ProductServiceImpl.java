package com.znlccy.media.core.service.impl;

import com.znlccy.media.core.model.Product;
import com.znlccy.media.core.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type ProductService 
 *
 * FileName：ProductService.java
 * Description：	产品服务实现类
 *
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				chencongye		2019/3/12-23:19			create
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int insert(Product product) {
        return 0;
    }

    @Override
    public int insertSelective(Product product) {
        return 0;
    }

    @Override
    public Product selectById(Long id) {
        return null;
    }

    @Override
    public int updateByIdSelective(Product product) {
        return 0;
    }

    @Override
    public int updateById(Product product) {
        return 0;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> findAllByPage(int limit, int offset) {
        return null;
    }

    @Override
    public int batchDeleteByIds(List<Long> ids) {
        return 0;
    }

    @Override
    public int batchUpdateByIds(List<Long> ids) {
        return 0;
    }
}
