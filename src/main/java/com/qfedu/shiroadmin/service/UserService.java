package com.qfedu.shiroadmin.service;

import com.qfedu.shiroadmin.Common.vo.PageVo;
import com.qfedu.shiroadmin.entity.SysUser;
import com.qfedu.shiroadmin.Common.vo.ResultVo;

/**
 * @author gengweichao
 * @date 2019/3/5 14:39
 */

public interface UserService {

    //新增
    ResultVo save(SysUser user,int rid);
    //登录
    ResultVo login(String name,String password);
    //查询分页
    PageVo<SysUser> queryPage(int page,int limit);
}
