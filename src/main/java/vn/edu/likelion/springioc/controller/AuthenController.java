package vn.edu.likelion.springioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.likelion.springioc.service.MyService;

@Controller
public class AuthenController {
    @Autowired
    MyService myService;

    public void print() {

        System.out.println("Xu ly input");
        myService.print("Gọi đến service");
    }
}
