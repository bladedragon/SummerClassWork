package team.redrock.thirdclasswork.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.redrock.thirdclasswork.entity.Teacher;
import team.redrock.thirdclasswork.mapper.TeacherMapper;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherMapper teacherMapper;

    @RequestMapping("/SelectId")
    public Teacher SelectTeacherByT_id(String t_id){
        Teacher teacher = teacherMapper.SelectTeacherByT_id(Integer.parseInt(t_id));
        return teacher;
    }
}
