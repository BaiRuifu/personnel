package personnel.zpark.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personnel.zpark.model.Basic;
import personnel.zpark.model.BasicExample;

public interface BasicMapper {
    long countByExample(BasicExample example);

    int deleteByExample(BasicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Basic record);

    int insertSelective(Basic record);

    List<Basic> selectByExample(BasicExample example);

    Basic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Basic record, @Param("example") BasicExample example);

    int updateByExample(@Param("record") Basic record, @Param("example") BasicExample example);

    int updateByPrimaryKeySelective(Basic record);

    int updateByPrimaryKey(Basic record);
}