package com.phn.bootjpa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author PengHenan
 * @create  2020-03-03 0:43:07
 */
@Entity
@Table(name = "tb_book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  表示主键自增长
    private Integer bid;
    private String bname;
    private Float bprice;
    private Integer tid;

    public Book() {
    }

    public Book(Integer bid, String bname, Float bprice, Integer tid) {
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
        this.tid = tid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Float getBprice() {
        return bprice;
    }

    public void setBprice(Float bprice) {
        this.bprice = bprice;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }


    @Override
    public String toString() {
        return "Bool{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bprice=" + bprice +
                ", tid=" + tid +
                '}';
    }
}
