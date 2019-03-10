package itao.workspace.spring.schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author itao
 * @create 2019-03-10 14:22
 */
@Service
public class ScheduleTaskService {
    private static final SimpleDateFormat dateFormet = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次:"+dateFormet.format(new Date()));
    }
    @Scheduled(cron ="0 31 14 ? * *" )
    public void fixTimeExecutor(){
        System.out.println("在指定时间:"+dateFormet.format(new Date())+" 执行");
    }
}
