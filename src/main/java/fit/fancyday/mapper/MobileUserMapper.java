package fit.fancyday.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fit.fancyday.domain.MobileUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author SingAurora
 * @description 针对表【mobile_user(移动端用户信息表)】的数据库操作Mapper
 * @createDate 2023-03-31 19:37:49
 * @Entity fit.fancyday.domain.MobileUser
 */
@Mapper
public interface MobileUserMapper extends BaseMapper<MobileUser> {
    MobileUser test(Integer id);
    @Select("select * from mobile_user where id = #{id}")
    MobileUser test2(Integer id);
}




