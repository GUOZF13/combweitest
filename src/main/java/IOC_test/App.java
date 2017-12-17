package IOC_test;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException {
        System.out.println(test2("IOC_test.InstanceTest"));
        InstanceTest o  = (InstanceTest) test2("IOC_test.InstanceTest");
        System.out.println(o.getAge());
    }
    private static void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Ioc_test bean = context.getBean(Ioc_test.class);
        bean.setName("sd");
        bean.setAge("12");

        System.out.println(bean.toString());

        System.out.println( "Hello World!" );
    }
    private static Object test2(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> aClass = Class.forName(str);
        Field age = aClass.getDeclaredField("age");
        Object obj = aClass.newInstance();
        age.setAccessible(true);
        age.set(obj,"110");
        System.out.println(age.get(obj) + "\t1");
        return obj;
    }
}
