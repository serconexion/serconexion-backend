package serconexion.api;

//import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import serconexion.model.User;
import serconexion.service.UserService;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController //cambiar a lo apropiado para app
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping //cambiar a lo apropiado para app
    //public void addUser(@NotNull @RequestBody User user){ userService.addUser(user);    }
    public void addUser( @RequestBody User user){ userService.addUser(user);    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") UUID id){
        return userService.getUserById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") UUID id){
        userService.deleteUser(id);
    }
    @PutMapping(path = "{id}")
   /*
    public void updateUser(@PathVariable("id") UUID id,@NotNull @RequestBody User userToUpdate){
        userService.updateUser(id,userToUpdate);
    }
   */
    public void updateUser(@PathVariable("id") UUID id, @RequestBody User userToUpdate){
        userService.updateUser(id,userToUpdate);
    }
}
