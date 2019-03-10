package itao.workspace.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author itao
 * @create 2019-03-09 22:43
 */
//发布事件
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;
    public void publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
