package triangle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xujian on 2015/8/25.
 */
public class TriangleTest {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Triangle obj = (Triangle) context.getBean("triangle");
        obj.drawPoint();
    }

}
