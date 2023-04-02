package top.openbian.OpenBianAPI.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.openbian.OpenBianAPI.Model.User;
import top.openbian.OpenBianAPI.Model.UserRepository;

@Controller
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add")
    public @ResponseBody String addNewUser (String Name) {
        User n = new User();
        n.setUID(5);
        n.setName(Name);
        n.setPassword("123");
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}