package team.redrock.thirdclasswork.mapper;



import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import team.redrock.thirdclasswork.entity.StuClass;
import team.redrock.thirdclasswork.entity.Teacher;


import java.util.List;

@Mapper

public interface ClassMapper {

    @Select("select * from class where t_id in (select t_id from teacher where t_name =#{t_name})")
    @Results({
            @Result( property = "teacher", column = "t_id",
                    one = @One(select = "team.redrock.thirdclasswork.mapper.TeacherMapper.SelectTeacherByT_id" )),
            @Result(property = "students", column = "c_id"
                    ,many = @Many(select = "team.redrock.thirdclasswork.mapper.StudentMapper.SelectStudentByC_id"))
    })
    public List<StuClass> SelectClassByT_name(String t_name);

    @Select("select * from class where c_id in (select c_id from student where stu_name = #{stu_name}) ")
    @Results({
            @Result( property = "teacher", column = "t_id",
                    one = @One(select = "team.redrock.thirdclasswork.mapper.TeacherMapper.SelectTeacherByT_id" )),
            @Result(property = "students", column = "c_id"
                    ,many = @Many(select = "team.redrock.thirdclasswork.mapper.StudentMapper.SelectStudentByC_id"))
    })
    public List<StuClass> SelectClassByStu_name(String stu_name);


    @Select("Select * from class where c_id = #{c_id}")
    public StuClass SelectClassByC_id(int c_id);


}

