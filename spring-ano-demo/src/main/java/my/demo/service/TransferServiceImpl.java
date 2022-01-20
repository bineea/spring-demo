package my.demo.service;

import my.demo.dao.entity.SampleTransfer;
import my.demo.dao.mapper.SampleTransferMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TransferServiceImpl  implements TransferService{

    @Autowired
    private SampleTransferMapper sampleTransferMapper;

    @PostConstruct
    public void init() {
        System.out.println("触发my.demo.service.TransferServiceImpl方法执行~~~");
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
