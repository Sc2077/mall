package com.ddd.nosql.elasticsearch.repository;

import com.ddd.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * @author zyb
 * @create 2021/1/4 14:14
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
