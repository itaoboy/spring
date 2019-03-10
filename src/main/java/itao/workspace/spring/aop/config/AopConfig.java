package itao.workspace.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author itao
 * @since 2019-03-09 16:18
 * 使用@EnableAspectJAutoProxy开启spring对AspectJ的支持
 */
@Configuration
@ComponentScan("itao.workspace.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
