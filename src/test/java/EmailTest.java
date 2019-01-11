import com.ls.shares.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/211:08
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EmailTest {

    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void send(){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1196110841@qq.com");
        message.setTo("1074587907@qq.com");
        message.setSubject("hahaha");
        message.setText("的方式东方鲎松岛枫松岛枫松岛枫");
        mailSender.send(message);
    }
}
