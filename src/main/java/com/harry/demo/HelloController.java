package com.harry.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController//返回Json
public class HelloController {

    @Autowired
        private GirlProperties girlProperties;


    /*@RequestMapping(value = "/Hello",method = RequestMethod.GET)*///配置url
    @GetMapping(value = {"/hi/{id}","/Hello"})
    private String say(@PathVariable("id") Integer id){//通过PathVariable来获取url中的值
                    /*(@RequestParam(value="id",required=false(不必传),defaultValue="0"(设定默认值，只能是字符串)) Integer id)//通过RequestParam来获取？id=189 这种格式的url值*/

        /*return girlProperties.getCupSize();*/
        return "id: " +id;
    }

}


