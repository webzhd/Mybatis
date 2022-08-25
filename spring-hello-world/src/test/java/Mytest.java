import com.zd.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) classPathXmlApplicationContext.getBean("hello");
        System.out.println(hello.toString());
    }
}
