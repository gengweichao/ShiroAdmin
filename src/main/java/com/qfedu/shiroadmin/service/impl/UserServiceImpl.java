package com.qfedu.shiroadmin.service.impl;

import com.qfedu.shiroadmin.Common.util.ResultUtil;
import com.qfedu.shiroadmin.Common.vo.PageVo;
import com.qfedu.shiroadmin.dao.SysUserMapper;
import com.qfedu.shiroadmin.entity.SysUser;
import com.qfedu.shiroadmin.service.UserService;
import com.qfedu.shiroadmin.Common.vo.ResultVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gengweichao
 * @date 2019/3/5 14:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserDao;

    @Override
    public ResultVo save(SysUser user, int rid) {
        sysUserDao.insert(user);
        return null;
    }

    @Override
    public ResultVo login(String name, String password) {
        SysUser user =  sysUserDao.selectByName(name);
        if (user != null ){
            if (user.getPassword().equals(password)){
                return ResultUtil.exec(true,"OK",user);
            }
        }
        return ResultUtil.exec(false,"用户名或者密码错误",null);

    }

    @Override
    public PageVo<SysUser> queryPage(int page, int limit) {
        return null;
    }


}
