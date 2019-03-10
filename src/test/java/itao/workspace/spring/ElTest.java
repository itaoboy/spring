package itao.workspace.spring;

import itao.workspace.spring.el.ElConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @create 2019-03-09 22:02
 */
public class ElTest {

    @Test
    public void testEl(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig el = context.getBean(ElConfig.class);
        el.outputParams();
    }

}
