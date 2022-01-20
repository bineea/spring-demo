package my.demo.service;

import my.demo.dao.entity.SampleTransfer;
import my.demo.dao.mapper.SampleTransferMapper;

import java.math.BigDecimal;

public class TransferServiceImpl  implements TransferService{

    private SampleTransferMapper sampleTransferMapper;

    public SampleTransferMapper getSampleTransferMapper() {
        return sampleTransferMapper;
    }

    public void setSampleTransferMapper(SampleTransferMapper sampleTransferMapper) {
        this.sampleTransferMapper = sampleTransferMapper;
    }

    @Override
    public SampleTransfer findByAccount(String account) {
        return sampleTransferMapper.findByAccount(account);
    }

    @Override
    public int updateTransfer(SampleTransfer transfer) {
        return sampleTransferMapper.updateTotalById(transfer);
    }
}
