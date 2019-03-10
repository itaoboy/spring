package itao.workspace.spring.ioc.service;

import org.springframework.stereotype.Service;

/**
 * @author itao
 * @since 2019-03-09 11:24
 */
//基于注解：spring管理的一个bean
@Service
public class FunctionService {
    public  String  sayHello(String word){
        return "Hello "+word;
    }
}
