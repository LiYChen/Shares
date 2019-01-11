import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ls.shares.Application;
import com.ls.shares.system.entity.RegisteredUser;
import com.ls.shares.system.mapper.RegisteredUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

/**
 * @Desciption
 * @Author hp
 * @Date 2018/12/2615:09
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SampleTest {

    @Autowired
    private RegisteredUserMapper userMapper;

    @Test
    public void save(){

        System.out.println("###########开始");
        for (int i = 0; i < 20; i++) {
            String number = "139";
            Random random = new Random();
            for (int j = 0; j < 8; j++) {
                number += random.nextInt(9);
            }
            RegisteredUser user = new RegisteredUser();
            user.setNickname("我是mybatis"+i);  //昵称
            user.setPhone(number);  //手机号
            user.setPassword("000000");  //密码
            userMapper.insert(user);
        }
        System.out.println("###########结束");
    }

    @Test
    public void pagelist(){
        System.out.println("分页起始：");
        IPage<RegisteredUser> page = new Page<RegisteredUser>(1,10);
        QueryWrapper<RegisteredUser> wrapper = new QueryWrapper<>();

        IPage<RegisteredUser> registeredUserIPage = userMapper.selectPage(page, wrapper);
        List<RegisteredUser> users = registeredUserIPage.getRecords();
        for (RegisteredUser user:
                users) {
            System.out.println(user.getNickname()+"\t"+user.getPhone());
        }
        System.out.println("分页结束：");
    }

    @Test
    public void QueryParm(){
        String name = "我是mybatis1";
        LambdaQueryWrapper<RegisteredUser> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(RegisteredUser::getNickname,name);
        RegisteredUser user = userMapper.selectOne(wrapper);
        System.out.println(user.getNickname()+user.getPhone());

    }
}
