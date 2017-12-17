package IOC_test;

/**
 * @Author : 郭志锋
 * @Date : Create in 9:23 2017/12/16
 * @Des : 添加描述
 */
public class Ioc_test {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Ioc_test() {
    }

    @Override
    public String toString() {
        return "Ioc_test{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
