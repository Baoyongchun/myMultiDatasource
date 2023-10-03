package com.myapp.mdatasource.Service;

import com.myapp.mdatasource.Mapper.primary.MultiDataServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @BelongsProject: multidatasource
 * @BelongsPackage: com.example.multidatasource.Service
 * @Author: baoyongchun
 * @CreateTime: 2023-01-12  14:46
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class MultiDataServiceImpl implements MultiDataService{
    @Autowired
    private MultiDataServiceMapper multiDataServiceMapper;
    @Override
    public Map getInfo(){
        Map<String, Object> result = multiDataServiceMapper.selectFirst();
        return result;
    }
}
