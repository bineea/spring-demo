package my.demo.dao.mapper;

import my.demo.dao.entity.SampleTransfer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleTransferMapper {

    List<SampleTransfer> findAll();

    SampleTransfer findByAccount(String account);

    int updateTotalById(SampleTransfer sampleTransfer);
}
