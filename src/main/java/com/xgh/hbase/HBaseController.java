package com.xgh.hbase;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HBaseController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/hbase",method = RequestMethod.GET)
    public String testWeb() {
        userService.insert();
        return "testWeb";
    }

}
