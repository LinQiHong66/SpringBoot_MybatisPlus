package com.warrior.controler;

import com.warrior.entity.Student;
import com.warrior.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
@Controller
@RequestMapping("/warrior/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        //insert
        Student student = new Student()
                .setStuName("linqihong")
                .setStuNumber("15218612811")
                .setAge(23);
        boolean res = iStudentService.insert(student);

        return res ? "success" : "fail";
    }
}
