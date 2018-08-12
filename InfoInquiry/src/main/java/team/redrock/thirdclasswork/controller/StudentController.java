package team.redrock.thirdclasswork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.redrock.thirdclasswork.entity.StuClass;
import team.redrock.thirdclasswork.entity.Student;
import team.redrock.thirdclasswork.mapper.StudentMapper;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @GetMapping(value = "/SelectName")
    public Student SelectStudentByS_name(String s_name){
        Student student = studentMapper.SelectStudentByS_name(s_name);
        return student;
    }

    @GetMapping(value = "/SelectId")
    public Student SelectStudentByS_id(String s_id){
        Student student = studentMapper.SelectStudentByS_id(Integer.parseInt(s_id));

        return student;
    }
    @RequestMapping(value = "/Add",method = RequestMethod.POST)
    public void AddStudent(Student student){
        studentMapper.AddStudnet(student);
    }

    @PostMapping("/Delete")
    public void DeleteStudentBys_id(String id){
        studentMapper.DeleteStudent(Integer.parseInt(id));
    }

    @PostMapping("/Update")
    public void UpdateStudentBys_id(Student student){
        studentMapper.updateStudent(student);
    }


    }
