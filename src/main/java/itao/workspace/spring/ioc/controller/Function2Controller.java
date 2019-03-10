package itao.workspace.spring.ioc.controller;

import itao.workspace.spring.ioc.service.Function2Service;

/**
 * @author itao
 * @since 2019-03-09 12:15
 */
//基于java配置此处没有@Service
public class Function2Controller {
    //基于java配置此处没有@Autowired
    Function2Service function2Service;

    public void setFunction2Service(Function2Service function2Service) {
        this.function2Service = function2Service;
    }

    public  String sayHello(String word){
        return function2Service.sayHello(word);
    }
}
