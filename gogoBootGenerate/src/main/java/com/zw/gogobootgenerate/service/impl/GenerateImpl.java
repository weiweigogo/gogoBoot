package com.zw.gogobootgenerate.service.impl;

import com.zw.gogobootgenerate.service.Generate;

import java.util.List;

public class GenerateImpl implements Generate {

    @Override
    public String generateTable(String tableName) {

        //根据表名找到对应的结构，如果没有则报表明不存在

        //根据表中结构生成内容

        return "";
    }


    @Override
    public List<String> getDatabaseName() {

        return List.of();
    }
}
