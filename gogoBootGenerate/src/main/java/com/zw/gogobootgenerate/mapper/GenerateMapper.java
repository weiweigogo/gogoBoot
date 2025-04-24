package com.zw.gogobootgenerate.mapper;


import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GenerateMapper {

    @Select("show DATABASES")
    List<String> getDatabaseName();
}
