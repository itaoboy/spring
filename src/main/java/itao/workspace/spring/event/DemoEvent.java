package itao.workspace.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author itao
 * @create 2019-03-09 22:38
 */
//自定义事件:作为消息传送载体
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
