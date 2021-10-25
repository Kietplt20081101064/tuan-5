gói  com.kiet2008110164.tuan05 ;

nhập  java.util.ArrayList ;
nhập  java.util.Scanner ;

 lớp  công khai SVGDTestDrive {

    static  ArrayList < SVGD > list =  new  ArrayList < SVGD > ();
    static  Scanner sc =  new  Scanner ( Hệ thống . in);

    static  void  nhap () {
        trong khi ( đúng ) {
            SVGD sinhVien =  new  SVGD ();
            sinhVien . nhapThongTin ();
            danh sách . add (sinhVien);
            Hệ thống . ra ngoài . print ( " Bạn có muốn tiếp tục (y / n): " );
            if (sc . nextLine () . equals ( " n " ))
                phá vỡ ;
        }
    }

    static  void  xuat () {
        cho ( SVGD x : list) {
            x . xuatThongTin ();
        }
    }

    static  void  xuatDanhSachTheoKhoangDiem () {
        Hệ thống . ra ngoài . print ( " Import point min: " );
        Nhân đôi min = sc . nextDouble ();
        Hệ thống . ra ngoài . print ( " Nhập điểm max: " );
        Tối đa gấp đôi = sc . nextDouble ();
        cho ( SVGD x : list) {
            if (x . diemTB > = min && x . diemTB <= max) {
                x . xuatThongTin ();
            }
        }
    }

    static  void  Tim () {
        cho ( SVGD x : list) {
            Hệ thống . ra ngoài . print ( " Nhập tên sinh viên cần tìm: " );
            if (sc . nextLine () . bằng (x . hoTen))
            Hệ thống . ra ngoài . println ( " ____________________________________________ " );
            Hệ thống . ra ngoài . println ( " Họ và tên: "  + x . hoTen);
            Hệ thống . ra ngoài . println ( " Điểm trung bình: "  + x . diemTB);
            Hệ thống . ra ngoài . println ( " ____________________________________________ " );
        }
    }

    static  void  Sua () {
        cho ( SVGD x : list) {
            Hệ thống . ra ngoài . print ( " Nhập tên sinh viên cần sửa: " );
            if (sc . nextLine () . equals (x . hoTen)) {
                Hệ thống . ra ngoài . print ( " Import point new: " );
                x . diemTB = sc . nextDouble ();
                sc . hàng tiếp theo();
            }
        }
    }

    static  void  Xoa () {
        cho ( SVGD x : list) {
            Hệ thống . ra ngoài . print ( " Nhập vào tên sinh viên cần xoá: " );
            if (sc . nextLine () . bằng (x . hoTen))
                danh sách . loại bỏ (x);
        }
    }

    static  void  Menu () {
        Hệ thống . ra ngoài . println ( " ____________________MENU____________________ " );
        Hệ thống . ra ngoài . println ( " | >> 1. Nhập danh sách sinh viên. | " );
        Hệ thống . ra ngoài . println ( " | >> 2. Export list sinh vien. | " );
        Hệ thống . ra ngoài . println ( " | >> 3. Sắp xếp theo khoảng điểm. | " );
        Hệ thống . ra ngoài . println ( " | >> 4. Tìm 1 sinh viên. | " );
        Hệ thống . ra ngoài . println ( " | >> 5. Xoá 1 sinh viên. | " );
        Hệ thống . ra ngoài . println ( " | >> 6. Edit 1 sinh viên. | " );
        Hệ thống . ra ngoài . println ( " | >> 7. Kết thúc! | " );
        Hệ thống . ra ngoài . println ( " | ____________________________________________ | " );
        Hệ thống . ra ngoài . print ( " Mời bạn chọn: " );
        int key = sc . nextInt ();
        sc . hàng tiếp theo();
        chuyển (phím) {
            trường hợp  1 :
                Hệ thống . ra ngoài . println ( " >> 1. Nhập danh sách sinh viên. << " );
                nhap ();
                phá vỡ ;
            trường hợp  2 :
                Hệ thống . ra ngoài . println ( " >> 2. Export danh sách sinh viên. << " );
                xuat ();
                phá vỡ ;
            trường hợp  3 :
                Hệ thống . ra ngoài . println ( " >> 3. Sắp xếp theo khoảng. << " );
                xuatDanhSachTheoKhoangDiem ();
                phá vỡ ;
            trường hợp  4 :
                Hệ thống . ra ngoài . println ( " >> 4. Tìm 1 sinh viên. << " );
                Tim ();
                phá vỡ ;
            trường hợp  5 :
                Hệ thống . ra ngoài . println ( " >> 5. Xoá 1 sinh viên. << " );
                Xoa ();
                phá vỡ ;
            trường hợp  6 :
                Hệ thống . ra ngoài . println ( " >> 6. Edit 1 sinh viên. << " );
                Sua ();
                phá vỡ ;
            trường hợp  7 :
                Hệ thống . thoát ra ( 0 );
        }
    }

    static  void  clearScreen () {
        Hệ thống . ra ngoài . print ( " \ 0 33 [H \ 0 33 [2J " );
        Hệ thống . ra ngoài . tuôn ra();
    }

    public  static  void  main ( String [] args ) {
        làm {
            clearScreen ();
            Thực đơn();
            Hệ thống . ra ngoài . print ( " Quay về MENU lựa chọn? (y / n): " );
        } while (sc . nextLine () . equals ( " y " ));
    }
}