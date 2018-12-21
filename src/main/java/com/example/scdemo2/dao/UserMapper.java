package com.example.scdemo2.dao;

import com.example.scdemo2.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    SysUser findByUserName(String username);
}
