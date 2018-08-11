package team.redrock.thirdclasswork.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StuClass {
    private String c_id;
    private String c_name;
    private Teacher teacher;
    private List<Student> students;
}