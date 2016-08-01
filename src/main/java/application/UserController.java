package application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public void addNew(@ModelAttribute("user") User user){
        users.add(user);
    }
}
