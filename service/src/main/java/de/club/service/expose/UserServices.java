package de.club.service.expose;

//import de.club.dto.UserMapper;
import de.club.service.adapter.UserAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserServices {

   private final  UserAdapter userAdapter;

   @Autowired
    public UserServices(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }


    @PostMapping("/createuser")
  //  public ResponseEntity<Object> createUser(@RequestBody UserMapper userMapper) {
    public ResponseEntity<Object> createUser() {
       // userAdapter.AddUser(userMapper);
        return ResponseEntity.ok().build();
    }

}
