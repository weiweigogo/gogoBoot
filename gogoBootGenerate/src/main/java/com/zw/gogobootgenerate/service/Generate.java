package com.zw.gogobootgenerate.service;

import java.util.List;

public interface Generate {

    /**
     * 根据表名生成
     * @param tableName
     * @return
     */
    public String generateTable(String tableName);

    /**
     * 获取数据库名
     * @return
     */
    public List<String> getDatabaseName();


    /**
     * 获取表名
     * @return
     */
    public List<String> getTableName();

}
