package com.myapp.mdatasource.Mapper.primary;

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
public interface MultiDataServiceMapper extends Mapper<Object> {
    Map<String,Object> selectFirst();
}
