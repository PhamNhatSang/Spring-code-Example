package nhatsang.spring_training.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.yourpackage.service.*.*(..))")
    public void beforeServiceMethods() {
        System.out.println("Logging: Before executing service methods");
    }
}
