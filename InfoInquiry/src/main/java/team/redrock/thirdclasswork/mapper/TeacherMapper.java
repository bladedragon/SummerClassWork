package team.redrock.thirdclasswork.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import team.redrock.thirdclasswork.entity.Teacher;

@Mapper
@Repository
public interface TeacherMapper {
    @Select("Select * from teacher where t_id = #{t_id}")
    public Teacher SelectTeacherByT_id(int t_id);

    @Select("Select * from teacher where t_id in (Select t_id from class where c_id = #{c_id})")
    public Teacher SelectTeacherByC_id(int c_id);
}

