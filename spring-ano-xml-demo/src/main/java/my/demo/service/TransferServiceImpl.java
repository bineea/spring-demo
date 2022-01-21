package my.demo.service;

import my.demo.dao.entity.SampleTransfer;
import my.demo.dao.mapper.SampleTransferMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Service
public class TransferServiceImpl  implements TransferService{

    @Autowired
    private SampleTransferMapper sampleTransferMapper;

    @Value("${app.name}")
    private String appName;

    @PostConstruct
    public void init() {
        System.out.println("初始化应用："+appName+"-"+"my.demo.service.TransferServiceImpl~~~");
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
