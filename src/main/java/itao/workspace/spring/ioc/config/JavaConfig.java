package itao.workspace.spring.ioc.config;

import itao.workspace.spring.ioc.controller.Function2Controller;
import itao.workspace.spring.ioc.service.Function2Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author itao
 * @since  2019-03-09 12:18
 */
@Configuration
public class JavaConfig {

    @Bean
    public Function2Service function2Service(){
        return new Function2Service();
    }

    @Bean
    public Function2Controller function2Controller(){
        Function2Controller function2Controller = new Function2Controller();
        function2Controller.setFunction2Service(function2Service());
        return function2Controller;
    }
}
