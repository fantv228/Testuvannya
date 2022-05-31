package com.example.testuvannya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.battle.service.entity.Teacher;
import ua.com.battle.service.service.TeacherService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/login")
    public String getLogin(
//            HttpServletRequest request
    ) {
//        HttpSession session = request.getSession();
//        Users user = (Users) session.getAttribute("user");

//        if (user != null) {
//            return "redirect:/buy";
//        } else {

        return "login";
//        }
    }

    @PostMapping("/login")
    public String getTeacherFromDB(@RequestParam(name = "login") String login,
                             @RequestParam(name = "pass") String pass,
                             @RequestParam(name = "name") String name,
                             @RequestParam(name = "sname") String sname,
                             @RequestParam(name = "lname") String lname,
                             HttpServletRequest request
    ) {
        HttpSession session = request.getSession();
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        if (teacherService.getLogic(login, pass, name, sname, lname)) {
            teacher = teacherService.getTeacher(login);
            session.setAttribute("teacher", teacher);
            return "index";
        } else {
            return "login";
        }
    }
}
