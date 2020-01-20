package personnel.zpark.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personnel.zpark.model.Collage_idid;
import personnel.zpark.model.Collage_ididExample;

public interface Collage_ididMapper {
    long countByExample(Collage_ididExample example);

    int deleteByExample(Collage_ididExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Collage_idid record);

    int insertSelective(Collage_idid record);

    List<Collage_idid> selectByExample(Collage_ididExample example);

    Collage_idid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Collage_idid record, @Param("example") Collage_ididExample example);

    int updateByExample(@Param("record") Collage_idid record, @Param("example") Collage_ididExample example);

    int updateByPrimaryKeySelective(Collage_idid record);

    int updateByPrimaryKey(Collage_idid record);
}