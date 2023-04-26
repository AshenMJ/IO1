package com.example.punkty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    String[] myArray = {"user1", "user2", "user3"};
    @RequestMapping("/users")
    public String getUsers()
    {
        return Arrays.toString(this.myArray);
    }
}
