package com.ddd.service;

import com.ddd.mbg.model.PmsBrand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyb
 * @create 2020/12/31 22:31
 */
@Service
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    int creatBrand(PmsBrand pmsBrand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(Integer pageNum, Integer pageSize);

    Object getBrand(Long id);

    int updateBrand(Long id, PmsBrand pmsBrand);
    /**
     *
     * @param
     * @return ApiResponsdBody
     * @Date 2020/12/31 22:36
     * @Author zyb
     **/


}
