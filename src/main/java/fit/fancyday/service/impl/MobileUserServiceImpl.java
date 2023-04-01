package fit.fancyday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import fit.fancyday.domain.MobileUser;
import fit.fancyday.mapper.MobileUserMapper;
import fit.fancyday.service.MobileUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author asus
* @description 针对表【mobile_user(移动端用户信息表)】的数据库操作Service实现
* @createDate 2023-03-31 19:37:49
*/
@Slf4j
@Service
public class MobileUserServiceImpl extends ServiceImpl<MobileUserMapper, MobileUser>
    implements MobileUserService {
    @Autowired
    private MobileUserMapper mobileUserMapper;
    @Override
    public void test() {
        MobileUser mobileUser = mobileUserMapper.test2(1);
        log.info("mobileUser: {}", mobileUser);
    }

    @Override
    public void test2() {
        MobileUser mobileUser = this.getOne(null);
        log.info("mobileUser: {}", mobileUser);
    }
}




