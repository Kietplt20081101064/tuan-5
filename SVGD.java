gói  com.kiet2008110164.tuan05 ;

nhập  java.util.Scanner ;

 SVGD lớp  công khai {
    Chuỗi hoTen;
    Double diemTB;

    Máy quét sc =  Máy quét mới  ( Hệ thống . In);

    public  void  nhapThongTin () {
        Hệ thống . ra ngoài . print ( " Nhập họ và tên: " );
        hoTen = sc . hàng tiếp theo();
        Hệ thống . ra ngoài . print ( " Nhập điểm trung bình: " );
        diemTB = sc . nextDouble ();
    }

    public  void  xuatThongTin () {
        Hệ thống . ra ngoài . println ( " ____________________________________________ " );
        Hệ thống . ra ngoài . println ( " Họ và tên: "  + hoTen);
        Hệ thống . ra ngoài . println ( " Điểm trung bình: "  + diemTB);
        Hệ thống . ra ngoài . println ( " ____________________________________________ " );
    }
}