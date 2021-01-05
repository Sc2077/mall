package com.ddd.service;

import com.ddd.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author zyb
 * @create 2021/1/4 14:16
 */
public interface EsProductService {
    int importAll();
    void delete(Long id);
    EsProduct create(Long id);
    void delete(List<Long> ids);
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}
