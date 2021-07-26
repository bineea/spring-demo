package my.demo.manager;

import my.demo.dao.entity.SampleTransfer;

public interface TransferManager {
    /**
     * 处理转账操作
     * @param source
     * @param target
     */
    void handleTransfer(SampleTransfer source, SampleTransfer target);
}
