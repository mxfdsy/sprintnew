import com.aiprogram.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //加载Sprint
        ApplicationContext context = new ClassPathXmlApplicationContext("./com/aiprogram/resource/application-context.xml");
//        //获取bean
//        //方式一
//        User user = (User)context.getBean("user");
        //方式二
        User user1 = context.getBean(User.class);
        System.out.println(user1.getId());
        System.out.println(user1.getName());
    }
}
