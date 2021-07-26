package my.demo.manager;

import my.demo.dao.entity.SampleTransfer;
import my.demo.service.TransferService;

public class TransferManagerImpl implements TransferManager {

    private TransferService transferService;

    public TransferManagerImpl (TransferService transferService) {
        this.transferService = transferService;
    }

    @Override
    public void handleTransfer(SampleTransfer source, SampleTransfer target) {
        transferService.handleTransfer(source, target);
    }
}
