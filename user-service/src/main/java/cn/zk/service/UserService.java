package cn.zk.service;

import cn.zk.mapper.UserMapper;
import cn.zk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id)
    {
        return userMapper.selectByPrimaryKey(id);
    }
}
