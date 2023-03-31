package fit.fancyday.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import fit.fancyday.domain.MobileUser;
import fit.fancyday.mapper.MobileUserMapper;
import fit.fancyday.service.MobileUserService;
import org.springframework.stereotype.Service;

/**
* @author asus
* @description 针对表【mobile_user(移动端用户信息表)】的数据库操作Service实现
* @createDate 2023-03-31 19:37:49
*/
@Service
public class MobileUserServiceImpl extends ServiceImpl<MobileUserMapper, MobileUser>
    implements MobileUserService {

}




