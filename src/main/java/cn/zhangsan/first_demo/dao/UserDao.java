package cn.zhangsan.first_demo.dao;

import cn.zhangsan.first_demo.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Create on 2021/5/17
 **/
@Mapper
public interface UserDao {

    String table = "user";

    @Select("select * from " + table)
    List<User> findAll();

    @Select("select password from " + table + " where id=#{id}")
    String findPwdById(@Param("id") int id);

}
