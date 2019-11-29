import com.ncj.dao.UserMapper;
import com.ncj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test1() throws IOException {
        String resource = "spring-dao.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource);

        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");

        List<User> users = userMapper.selectUser();

        for (User user : users){
            System.out.println(user);
        }
    }
}
