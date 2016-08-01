package application;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by natad on 01.08.2016.
 */
@RestController
@RequestMapping("api/users")
public class UserController {
    private ArrayList<User> users = new ArrayList<User>();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<User> showAll(){
        return users;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addNew(@RequestBody User user){
        users.add(user);
    }
}
