package my.demo.dao.mapper;

import my.demo.dao.entity.SampleTransfer;

import java.util.List;

public interface SampleTransferMapper {

    List<SampleTransfer> findAll();

    SampleTransfer findById(long id);

    int updateTotalById(SampleTransfer sampleTransfer);
}
