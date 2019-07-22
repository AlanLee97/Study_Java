package test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * service层，进行业务处理
 *
 */
public class UserService {
    private UserDao userDao = new UserDao();
    public String findAllUser() throws Exception {
        //List集合
        List<User> userList = userDao.findAllUser();

        //使用jackson的jar包将List转成json字符串
        String json = new ObjectMapper().writeValueAsString(userList);

        //String的JSON类型
        return json;
    }

//    public static void main(String[] args) throws Exception {
//        String allUser = new UserService().findAllUser();
//        System.out.println(allUser);
//    }
}
