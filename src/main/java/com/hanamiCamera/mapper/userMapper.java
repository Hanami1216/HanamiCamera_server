package com.hanamiCamera.mapper;

import com.hanamiCamera.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/27  17:55
 */
@Mapper
public interface userMapper {
    User getUserList();
}
