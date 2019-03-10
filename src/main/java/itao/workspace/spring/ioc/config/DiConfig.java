package itao.workspace.spring.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author itao
 * @since 2019-03-09 11:50
 */
//扫描该路径下的文件，并注册为bean
@Configuration
@ComponentScan("itao.workspace.spring")
public class DiConfig {
}
