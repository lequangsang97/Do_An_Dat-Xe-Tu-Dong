import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Xe xe[];

    public static void main(String[] args) throws IOException {
//        for (int i = 0; i < xe.length; i++) {
//            xe[i].setToaDoX(ChucNang2.rand(-20, 20));
//            xe[i].setToaDoY(ChucNang2.rand(-20, 20));
//
//            // xe[i].Output();
//        }
        int soluotgoikhach = 0;
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            ChucNang3 xekhachgoi = ChucNang3.goiXe();
//            for (int i = 0; i < xe.length; i++) {
//                int toaDoKhachX = xekhachgoi.getToaDoDiX();
//                int toaDoKhachY = xekhachgoi.getToaDoDiY();
//                xe[i].setKhoangCach(Xe.khoangCach(xe[i].getToaDoX(), xe[i].getToaDoY(), toaDoKhachX, toaDoKhachY));
//            }
//            if (xekhachgoi.getLoaixek() == 1 && Xe.soLuongXeMay > 0) {
//                for (int i = 0; i < xe.length; i++) {
//                    if (xe[i].isTrangThai() == true && xe[i].getLoaiXe() == 1) {
//                        float kc = xe[i].getKhoangCach();
//                    }
//                }
//            }
//            System.out.println("Ban Co Muong Goi Xe Tiep Tuc (Yes, No): ");
//            String luachon = sc.nextLine();
//            if ("no".equals(luachon) || "NO".equals(luachon) || "No".equals(luachon)) {
//                break;
//            }
        
//            Xe[] xe = ChucNang1.main1();
//            Collections.sort
        //List<Xe> xe = new ArrayList<>();
        //xe = ChucNang1.main1(); // Gọi chương trình nạp dữ liệu xe vào chương trình.args
        //ChucNang2.goiXe(); // gọi chức năng 3  yêu cầu người dùng nhập vào đặt xe.args
        

            for(int i = 0; i < xe.length; i++)
            	xe[i].Output();
            	
        

        //System.out.println(xe[1].isTrangThai());

    }

}
