package my.demo.service;

import my.demo.dao.entity.SampleTransfer;

public interface TransferService {

    /**
     * 通过账号查询
     * @param account
     * @return
     */
    SampleTransfer findByAccount(String account);

    /**
     * 更新操作
     * @param transfer
     */
    int updateTransfer(SampleTransfer transfer);
}
