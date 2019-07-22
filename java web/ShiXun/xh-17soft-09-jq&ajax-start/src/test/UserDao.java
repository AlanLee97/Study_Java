package test;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    JdbcTemplate jt = new JdbcTemplate(DataSourceUtil.getDataSource());

    public List<User> findAllUser() {
        String sql = "select uid,username,password,email from tab_user";

        return jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }


//    public static void main(String[] args) {
//        List<User> allUser = new UserDao().findAllUser();
//        System.out.println(allUser);
//    }
}
