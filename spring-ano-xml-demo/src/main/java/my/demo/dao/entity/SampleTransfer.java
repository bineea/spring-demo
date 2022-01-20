package my.demo.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 账目信息表
 */
public class SampleTransfer implements Serializable {

    /**
     * 唯一标识
     */
    private Long id;
    /**
     * 账号
     */
    private String account;
    /**
     * 名称
     */
    private String name;
    /**
     * 总额
     */
    private BigDecimal total;

    @Override
    public String toString() {
        return "SampleTransfer{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
