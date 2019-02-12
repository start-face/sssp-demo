import com.sss.model.UserModel;
import com.sss.service.UserService;
import com.sss.tools.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-*.xml")
@Transactional
public class TCityRepositoryTest {

    @Autowired
    private UserService userService;

    @Test
    public void findByIdLessThanAndNameLike() throws Exception {
        PageInfo<UserModel> page = userService.findPage(new UserModel(), 10, 1);
        System.err.println(page.toString());
    }

    @Test
    public void testInsertUser() throws InterruptedException {
//        for (int i = 0; i < 2; i++) {
            UserModel data = new UserModel();
            data.setAddTime(new Date())
                    .setPassWord("123456")
                    .setPhone("1234567")
                    .setStatus(2)
                    .setUserName("tom");
            UserModel userModel = userService.insertUser(data);
            System.err.println(userModel);
//            Thread.sleep(5000);
//        }
    }
}