package itao.workspace.spring;

import itao.workspace.spring.event.DemoPublisher;
import itao.workspace.spring.event.EventConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @create 2019-03-09 22:47
 */
public class EventTest {
    @Test
    public void testEvent(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publisher("hello application event");
        context.close();
    }

}
