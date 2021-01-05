package com.ddd.service;

import com.ddd.common.api.CommonResult;

/**
 * @author zyb
 * @create 2021/1/3 18:00
 */
public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone,String authCode);

}
