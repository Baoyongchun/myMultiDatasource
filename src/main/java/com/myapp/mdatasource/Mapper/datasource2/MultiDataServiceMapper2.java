package com.myapp.mdatasource.Mapper.datasource2;

import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

/**
 * @BelongsProject: multidatasource
 * @BelongsPackage: com.example.multidatasource.Mapper
 * @Author: baoyongchun
 * @CreateTime: 2023-01-12  14:51
 * @Description: TODO
 * @Version: 1.0
 */
@org.apache.ibatis.annotations.Mapper
public interface MultiDataServiceMapper2 extends Mapper<Object> {
    Map<String,Object> selectFirst();
}
