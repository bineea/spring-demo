package my.demo.service;

import my.demo.dao.entity.SampleTransfer;
import my.demo.dao.mapper.SampleTransferMapper;

public class TransferServiceImpl  implements TransferService{

    private SampleTransferMapper sampleTransferMapper;

    @Override
    public void handleTransfer(SampleTransfer source, SampleTransfer target) {

    }

    public SampleTransferMapper getSampleTransferMapper() {
        return sampleTransferMapper;
    }

    public void setSampleTransferMapper(SampleTransferMapper sampleTransferMapper) {
        this.sampleTransferMapper = sampleTransferMapper;
    }
}
