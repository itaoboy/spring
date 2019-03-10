package itao.workspace.spring.schedule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author itao
 * @create 2019-03-10 14:28
 */
@Configuration
@ComponentScan("itao.workspace.spring.schedule")
@EnableScheduling
public class ScheduleConfig {
}
