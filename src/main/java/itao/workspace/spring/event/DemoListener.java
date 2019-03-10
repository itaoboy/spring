package itao.workspace.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author itao
 * @create 2019-03-09 22:40
 */
//事件监听器
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("DemoListener接收到来自DemoPublisher发布的消息:"+msg);
    }
}
