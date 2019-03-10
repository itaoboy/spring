package itao.workspace.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

/**
 * @author itao
 * @create 2019-03-09 21:57
 */
@Configuration
@PropertySource("classpath:test.properties")
public class ElConfig {
    // 字符参数注入
    @Value("I LOVE YOU")
    private String normal;
    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //注入表达式值
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomAnonther;
    //注入文件资源
    @Value("classpath:classpath:test.properties")
    private Resource testFile;
    //属性文件参数注入
    @Value("${book.name}")
    private String bookName;

    public void outputParams(){
        System.out.println("normal:"+normal);
        System.out.println("osName:"+osName);
        System.out.println("randomAnonther:"+randomAnonther);
        System.out.println("testFile:"+testFile);
        System.out.println("bookName:"+bookName);
    }
}
