package main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class App54 {
    public static void main(String[] args) throws Exception {
        // hinhtron
        HinhTron hinhtron = new HinhTron();
        hinhtron.xuatTen();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inTheTich();

        // hinh tru
        HinhTru hinhtru = new HinhTru();
        hinhtru.xuatTen();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.inTheTich();

        // hinh chu nhat
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.xuatTen();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();

        // hinh vuong
        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.xuatTen();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();
    }
}
