package com.zw.gogobootgenerate.controller;

import com.zw.gogobootcore.context.Result;
import com.zw.gogobootgenerate.entity.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tableController")
@Slf4j
public class tableController {

    @GetMapping("/list")
    public Result<List<Table>> getList(Table table){

        return Result.OK(new ArrayList<Table>());
    }

    @GetMapping("/byId")
    public Result<Table> getTableById(String id){
        return Result.OK(new Table());
    }


    @PostMapping("/update")
    public Result<String> updateTable(Table table){
        return Result.OK("修改成功");
    }


}
