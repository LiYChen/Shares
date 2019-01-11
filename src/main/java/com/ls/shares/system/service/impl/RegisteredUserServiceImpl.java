package com.ls.shares.system.service.impl;

import com.ls.shares.system.entity.RegisteredUser;
import com.ls.shares.system.mapper.RegisteredUserMapper;
import com.ls.shares.system.service.IRegisteredUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-01-09
 */
@Service
public class RegisteredUserServiceImpl extends ServiceImpl<RegisteredUserMapper, RegisteredUser> implements IRegisteredUserService {

}
