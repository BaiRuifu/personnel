package personnel.zpark.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personnel.zpark.model.Coefficientid;
import personnel.zpark.model.CoefficientidExample;

public interface CoefficientidMapper {
    long countByExample(CoefficientidExample example);

    int deleteByExample(CoefficientidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coefficientid record);

    int insertSelective(Coefficientid record);

    List<Coefficientid> selectByExample(CoefficientidExample example);

    Coefficientid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coefficientid record, @Param("example") CoefficientidExample example);

    int updateByExample(@Param("record") Coefficientid record, @Param("example") CoefficientidExample example);

    int updateByPrimaryKeySelective(Coefficientid record);

    int updateByPrimaryKey(Coefficientid record);
}