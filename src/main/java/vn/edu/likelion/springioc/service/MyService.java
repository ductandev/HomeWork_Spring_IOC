package vn.edu.likelion.springioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.likelion.springioc.component.MyBean;

@Service
public class MyService {

    private final MyBean myBean;

    @Autowired
    public MyService(MyBean myBean) {
        this.myBean = myBean;
    }

    public void performAction() {
        myBean.sayHello();
    }

    public void print(String message) {
        System.out.println("Model Mapperrrrrrrrrrr: " + message);
    }

}
