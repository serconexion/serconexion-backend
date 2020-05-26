package serconexion.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import serconexion.model.User;
import serconexion.service.UserService;

@RestController //cambiar a lo apropiado para app
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping //cambiar a lo apropiado para app
    public void addUser(User user){
        userService.addUser(user);
    }
}
