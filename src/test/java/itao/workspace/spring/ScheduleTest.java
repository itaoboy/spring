package itao.workspace.spring;

import itao.workspace.spring.schedule.config.ScheduleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @create 2019-03-10 14:29
 */
public class ScheduleTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
    }
}
