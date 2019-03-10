package itao.workspace.spring.aop.annotation;

import java.lang.annotation.*;

/**
 * @author itao
 * @since 2019-03-09 15:47
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
