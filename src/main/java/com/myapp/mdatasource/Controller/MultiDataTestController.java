package com.myapp.mdatasource.Controller;

import com.myapp.mdatasource.Service.MultiDataService;
import com.myapp.mdatasource.Service.MultiDataService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @BelongsProject: multidatasource
 * @BelongsPackage: com.example.multidatasource.Controller
 * @Author: baoyongchun
 * @CreateTime: 2023-01-12  14:41
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
@RequestMapping("/multiDataTest")
public class MultiDataTestController {
    @Autowired
    private MultiDataService multiDataService;
    @Autowired
    private MultiDataService2 multiDataService2;

    @GetMapping("/getPrimaryInfo")
    @ResponseBody
    private Map getInfo(){
        Map<String, Object> result = multiDataService.getInfo();
        return result;
    }

    @GetMapping("/getDatasource2Info")
    @ResponseBody
    private Map getDatasource2Info(){
        Map<String, Object> result = multiDataService2.getInfo();
        return result;
    }
}
