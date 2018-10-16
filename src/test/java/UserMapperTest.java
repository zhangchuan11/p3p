import com.ccit.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@ContextConfiguration(locations ={ "spring-*.xml"})
public class UserMapperTest {

    @Autowired
    UserMapper UserDao;
    @Test
    public void selectUserById() {
        UserDao.selectUserById("92B0A794-73D3-11E8-B278-C85B764C5D47");
        System.out.println("1");
    }
}