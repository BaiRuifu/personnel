package personnel.zpark.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import personnel.zpark.model.Certificate;
import personnel.zpark.model.CertificateExample;

public interface CertificateMapper {
    long countByExample(CertificateExample example);

    int deleteByExample(CertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Certificate record);

    int insertSelective(Certificate record);

    List<Certificate> selectByExample(CertificateExample example);

    Certificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExample(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByPrimaryKeySelective(Certificate record);

    int updateByPrimaryKey(Certificate record);
}