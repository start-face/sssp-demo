import com.sss.dao.UserRepository;
import com.sss.model.UserModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

public class SSSPTest {

    @Autowired
    private UserRepository userRepository;

    private ApplicationContext ctx = null;{
        ctx = new ClassPathXmlApplicationContext("spring-content.xml");
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());

        UserModel data = new UserModel();
        data.setAddTime(new Date())
                .setPassWord("123456")
                .setPhone("12345678978946")
                .setStatus(1)
                .setUserName("tom");
        UserModel save = userRepository.save(data);
        System.err.println(save);
    }
}