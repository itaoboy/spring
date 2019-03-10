package itao.workspace.spring.aop.service;

import itao.workspace.spring.aop.annotation.Action;
import org.springframework.stereotype.Service;
/**
 * @author itao
 * @since 2019-03-09 15:51
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add(){}
}
