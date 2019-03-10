package itao.workspace.spring;

import itao.workspace.spring.ioc.config.DiConfig;
import itao.workspace.spring.ioc.config.JavaConfig;
import itao.workspace.spring.ioc.controller.Function2Controller;
import itao.workspace.spring.ioc.controller.FunctionController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @since 2019-03-09 16:51
 */
public class IocTest {
    //测试基于注解配置
    @Test
    public void testDi(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        FunctionController functionController = context.getBean(FunctionController.class);
        System.out.println(functionController.sayHello("spring 3.X 声明式配置"));
        context.close();
    }

    //测试基于java配置
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Function2Controller function2Controller = context.getBean(Function2Controller.class);
        System.out.println(function2Controller.sayHello("spring 4.X Java配置"));
        context.close();
    }
}
