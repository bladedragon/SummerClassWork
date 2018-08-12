package team.redrock.thirdclasswork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.redrock.thirdclasswork.entity.StuClass;
import team.redrock.thirdclasswork.entity.Student;
import team.redrock.thirdclasswork.mapper.ClassMapper;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    ClassMapper classMapper;

    @RequestMapping("/SelectT_name")
    public List<StuClass> SelectClassByT_name(String t_name){

        List<StuClass> stuClassList = classMapper.SelectClassByT_name(t_name);
        return  stuClassList;
    }

    @RequestMapping("/SelectStu_name")
    public List<StuClass> SelectClassByStu_name(String stu_name){

        List<StuClass> stuClassList = classMapper.SelectClassByStu_name(stu_name);
        return  stuClassList;
    }


    @GetMapping(value = "/SelectId")
    public StuClass SelectClassByS_id(String c_id){
        StuClass stuClass = classMapper.SelectClassByC_id(Integer.parseInt(c_id));

        return stuClass;
    }
}
