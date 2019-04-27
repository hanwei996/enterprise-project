package com.shadow.api.rest;

import com.shadow.mybatis.pojo.User;
import com.shadow.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

//@Path("/product")
//@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
//@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//@Service("productRestService")
@RestController
@RequestMapping("/rest")
public class RestUserController {
    @Autowired(required = false)
    private UserService userService;

    // 通过用户id查找用户
   // @Path("/findUserById/{id}")
    @GetMapping("/findUserById/{id}")
    @ResponseBody
    public User findUserById(@PathVariable("id") long id){
        System.out.println("id = "+id);
        return userService.findUserById(id);
    }
 /*   @Path("/deleteUserById")
    public int deleteUserById(){
        return userService.
    }*/
     // 插入用户
    /* @Path("/insertUser")
     @POST*/
    // POST restful 方式
     @PostMapping("/insertUser")
     @ResponseBody
     public int insertUser( User user){
         System.out.println("U="+user.toString());
        return userService.insertUser(user);
     }
}
