package team.redrock.thirdclasswork.mapper;


import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import team.redrock.thirdclasswork.entity.Student;

@Mapper
public interface StudentMapper {

    @Select("select * from student where stu_id = #{stu_id} ")
     Student SelectStudentByS_id(int stu_id);

    @Select("select * from student where stu_name = #{stu_name} ")
    Student SelectStudentByS_name(String stu_name);

    @Select("select * from student where class_id = #{c_id} ")
    Student SelectStudentByC_id(String c_id);

    @Insert("Insert into student(stu_id,stu_name,class_id) values(#{stu_id},#{stu_name},#{c_id}) ")
     void AddStudnet(Student student);

    @Delete("Delete from student where stu_id = #{stu_id} ")
    void DeleteStudent(int stu_id);

    @Update("update student set stu_name=#{stu_name},class_id=#{c_id} where stu_id=#{stu_id}")
    void updateStudent(Student student);


}
