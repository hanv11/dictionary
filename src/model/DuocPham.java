/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author nguyenha
 */
public class DuocPham implements Serializable{
    private int id;
    private String ten;
    private String tichchat;
    private String dinhtinh;
    private String dinhluong;
    private String tapchat;
    private String baoquan;

    public DuocPham() {
    }

    public DuocPham(int id, String ten, String tichchat, String dinhtinh, String dinhluong, String tapchat, String baoquan) {
        this.id = id;
        this.ten = ten;
        this.tichchat = tichchat;
        this.dinhtinh = dinhtinh;
        this.dinhluong = dinhluong;
        this.tapchat = tapchat;
        this.baoquan = baoquan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTichchat() {
        return tichchat;
    }

    public void setTichchat(String tichchat) {
        this.tichchat = tichchat;
    }

    public String getDinhtinh() {
        return dinhtinh;
    }

    public void setDinhtinh(String dinhtinh) {
        this.dinhtinh = dinhtinh;
    }

    public String getDinhluong() {
        return dinhluong;
    }

    public void setDinhluong(String dinhluong) {
        this.dinhluong = dinhluong;
    }

    public String getTapchat() {
        return tapchat;
    }

    public void setTapchat(String tapchat) {
        this.tapchat = tapchat;
    }

    public String getBaoquan() {
        return baoquan;
    }

    public void setBaoquan(String baoquan) {
        this.baoquan = baoquan;
    }
    
    
}
