package itao.workspace.spring;

import itao.workspace.spring.taskExecutor.config.TaskExecutorConfig;
import itao.workspace.spring.taskExecutor.service.AsyncTaskService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author itao
 * @create 2019-03-10 13:43
 */
public class TaskExecutorTest {
    //异步任务不能使用单元测试框架测试，需要使用Main函数才会输出结果
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
