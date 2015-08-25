package first_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xujian on 2015/8/25.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printMessage();
    }
}
