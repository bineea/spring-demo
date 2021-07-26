package my.demo.service;

import my.demo.dao.entity.SampleTransfer;

public interface TransferService {

    /**
     * 处理转账操作
     * @param source
     * @param target
     */
    void handleTransfer(SampleTransfer source, SampleTransfer target);
}
