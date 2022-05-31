package ua.com.battle.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.battle.service.entity.Teacher;
import ua.com.battle.service.repository.TeacherRepository;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public boolean getLogic(String login, String pass, String name, String sname, String lname) {

        boolean logic = false;
        Teacher teacher = TeacherRepository.findByLogin(login);
        if(teacher == null) { teacher = new Teacher();
            return false;
        }

        if((teacher.getLogin().equals(login)) &&
                (teacher.getPass().equals(pass)) &&
                (teacher.getName().equals(name)) &&
                (teacher.getSname().equals(sname)) &&
                (teacher.getLname().equals(lname))) logic = true;

        return logic;
    }

    public Teacher getTeacher(String login){
        return  TeacherRepository.findByLogin(login);
    }
}
