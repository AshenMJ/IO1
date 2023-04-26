package com.example.punkty;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    CopyOnWriteArrayList<String> users = new CopyOnWriteArrayList<>();

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String getUsers()
    {
        return users.toString();
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public int addUsers( @RequestBody String name)
    {
        this.users.add(name);
        return this.users.size();
    }
}
