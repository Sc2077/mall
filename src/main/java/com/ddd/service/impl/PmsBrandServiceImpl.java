package com.ddd.service.impl;

import com.ddd.mbg.mapper.PmsBrandMapper;
import com.ddd.mbg.model.PmsBrand;
import com.ddd.mbg.model.PmsBrandExample;
import com.ddd.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyb
 * @create 2021/1/2 20:18
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int creatBrand(PmsBrand pmsBrand) {
        return brandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }


    @Override
    public List<PmsBrand> listBrand(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public Object getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateBrand(Long id, PmsBrand pmsBrand) {
        pmsBrand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }
}
