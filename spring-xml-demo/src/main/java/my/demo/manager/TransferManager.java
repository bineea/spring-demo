package my.demo.manager;

import my.demo.dao.entity.SampleTransfer;

import java.math.BigDecimal;

public interface TransferManager {

    /**
     * 处理转账操作
     * @param fromAccount
     * @param toAccount
     * @param money
     */
    void handleTransfer(String fromAccount, String toAccount, BigDecimal money) throws Exception;
}
