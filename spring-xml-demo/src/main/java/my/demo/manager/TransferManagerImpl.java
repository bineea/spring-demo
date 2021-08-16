package my.demo.manager;

import my.demo.dao.entity.SampleTransfer;
import my.demo.service.TransferService;

import java.math.BigDecimal;

public class TransferManagerImpl implements TransferManager {

    private TransferService transferService;

    public TransferManagerImpl (TransferService transferService) {
        this.transferService = transferService;
    }

    @Override
    public void handleTransfer(String fromAccount, String toAccount, BigDecimal money) throws Exception {
        SampleTransfer fromTransfer = transferService.findByAccount(fromAccount);
        SampleTransfer toTransfer = transferService.findByAccount(toAccount);
        if(fromTransfer == null || toTransfer == null) {
            throw new Exception("账号信息不存在");
        }
        if(fromTransfer.getTotal().compareTo(money) < 0) {
            throw new Exception("余额不足");
        }
        fromTransfer.setTotal(fromTransfer.getTotal().subtract(money));
        toTransfer.setTotal(toTransfer.getTotal().add(money));
        transferService.updateTransfer(fromTransfer);
        transferService.updateTransfer(toTransfer);
    }
}
