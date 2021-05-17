package cn.zhangsan.first_demo.controller;

import cn.zhangsan.first_demo.model.User;
import cn.zhangsan.first_demo.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create on 2021/5/17
 **/
@RequestMapping("/")
@Controller
public class MainController {

    @Autowired
    UserService userService;


    @RequestMapping("/index")
    public String index(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "index";
    }

    /**
     * ResponseBody 作用是直接返回java object对象，不通过模板渲染
     */
    @RequestMapping("/get_user_pwd")
    @ResponseBody
    public Object getUserPwd(@RequestParam("id") int id) {
        Map<String, Object> resMap = new HashMap<>();
        String userPwd = userService.getUserPwd(id);
        if (userPwd == null || "".equals(userPwd)) {
            resMap.put("data", "密码为空");
        } else {
            resMap.put("data", userPwd);
        }
        return resMap;
    }

}
