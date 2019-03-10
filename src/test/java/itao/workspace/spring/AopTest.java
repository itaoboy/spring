package itao.workspace.spring;

import itao.workspace.spring.aop.config.AopConfig;
import itao.workspace.spring.aop.service.DemoAnnotationService;
import itao.workspace.spring.aop.service.DemoMethodService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @since 2019-03-09 16:47
 */
public class AopTest {

    @Test
    public void testAop(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        //基于自定义注解拦截
        demoAnnotationService.add();
        //基于切面规则拦截
        demoMethodService.add();
        context.close();
    }

}
