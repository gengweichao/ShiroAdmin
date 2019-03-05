package com.qfedu.shiroadmin.dao;


import com.qfedu.shiroadmin.entity.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);



    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //添加用户
    int insert(SysUser record);

    //根据用户id查找用户信息
    SysUser selectById(Integer id);

    //根据用户名查找用户信息
    SysUser selectByName(String name);

    //改用户状态
    int updateByIdFlag(@Param("id") int id,@Param("flag") int flag);

    //根据ID修改密码
    int updateByIdPassword(@Param("id") int id,@Param("password") int password);
}