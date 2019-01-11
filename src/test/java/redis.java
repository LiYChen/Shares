import com.ls.shares.Application;
import com.ls.shares.system.service.IRegisteredUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Desciption
 * @Author hp
 * @Date 2019/1/710:56
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class redis {

    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IRegisteredUserService service;


    //存入redis中
    @Test
    public void test(){

        template.opsForValue().set("test","bbb");

    }

    //取出redis
    @Test
    public void test2(){

        String test = template.opsForValue().get("test");
        System.out.println(test);

    }
}
