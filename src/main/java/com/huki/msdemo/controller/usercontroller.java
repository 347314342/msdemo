package com.huki.msdemo.controller;

import com.huki.msdemo.Entity.User;
import com.huki.msdemo.Entity.UserField;
import com.huki.msdemo.Service.UserFieldbus;
import com.huki.msdemo.Service.Userbus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class usercontroller {

    @Autowired
    UserFieldbus userFieldbus;

//    @RequestMapping("/userfiledlist")
//    @ResponseBody
//    public Map<String, Object> list(Model model){
//            //List<UserField> userFileds =  userFiledbus.selectuf();
//
//            //List<String> replies = model.addAttribute("list",userFileds);
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("replies", replies);
//            return map;
//
//
//    }




    @GetMapping("/userfield1")

    public List<UserField> userfield1(){


        List<UserField> list =userFieldbus.selectuf();
        return list;
    }

    @Autowired
    Userbus userbus;
    @PostMapping("/getuserbyselect")

    public List<User> getuserbyselect(String s){

         String s1 = s.replace("\"", "");
        List<User> list =userbus.selectbyb(s1);
        return list;
    }
//    public Map<String, Object> findReply(int mid){
//        System.out.println("mid:"+mid);
//        List<Reply> replies=replyService.findReply(mid);
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("replies", replies);
//        return map;
//    }

}
