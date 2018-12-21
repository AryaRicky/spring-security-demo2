package com.example.scdemo2.dao;

import com.example.scdemo2.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<Permission> findAll();

    List<Permission> findByAdminUserId(int userId);
}
