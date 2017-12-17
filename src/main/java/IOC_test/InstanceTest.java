package IOC_test;

/**
 * @Author : 郭志锋
 * @Date : Create in 20:55 2017/12/17
 * @Des : 添加描述
 */
public class InstanceTest {

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

    @Override
    public String toString() {
        return "InstanceTest{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
