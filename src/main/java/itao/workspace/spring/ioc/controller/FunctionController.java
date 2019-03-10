package itao.workspace.spring.ioc.controller;

import itao.workspace.spring.ioc.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author itao
 * @since 2019-03-09 11:53
 */
//基于注解声明bean
@Controller
public class FunctionController {
    //基于注解依赖注入bean
    @Autowired
    FunctionService functionService;

    public  String sayHello(String word){
        return functionService.sayHello(word);
    }
}
