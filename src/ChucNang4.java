import java.io.IOException;
import java.io.PipedReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import javax.net.ssl.ExtendedSSLSession;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

// Ä‘ï¿½?c tá»« file dá»¯ liá»‡u cÃ¡c xe.
abstract class ChucNang1 {

	public static List<Xe> xeMay = new ArrayList<>(); // Khá»Ÿi táº¡o ArrayList Ä‘á»ƒ lÆ°u trá»­ danh sÃ¡ch xe. // Import java.util.List;
	public static List<Xe> xeOto = new ArrayList<>();
	public static List<Xe> xeTai = new ArrayList<>();
	public static List<Xe> dsXeDuocGoi = new ArrayList<>(); // Lưu danh sách các xe khách hàng đã gọi.

	/* File file = new File("dsXe.txt");
	 if(!file.exists()) // kiÃªm tra file cÃ³ tá»“n táº¡i khÃ´ng, 
	 {
	file.createNewFile(); //náº¿u khÃ´ng thÃ¬ khá»Ÿi táº¡o file má»›i.
	 }
	 FileInputStream fileInputStream = new FileInputStream(file);// Táº¡o Ä‘á»‘i tÆ°á»£ng luá»“ng liÃªn káº¿t dá»¯ liá»‡u.
	 int c = fileInputStream.read(); // ï¿½?ï¿½?c tá»«ng kÃ­ tá»± trong file
	 int n = (char)c - '0'; // Ä‘á»™c sá»‘ lÆ°á»£ng xe kiá»ƒu integer.
	*/
	public static void readList() throws NumberFormatException, IOException {
		String str; // ?????
		FileReader fileInputStream = null;
		fileInputStream = new FileReader("dsXe.txt"); // Khởi tạo đối tượng đọc file.
		BufferedReader br = new BufferedReader(fileInputStream); // Khởi tạo luồng BufferedReader
		int n = Integer.parseInt(str = br.readLine()); // biến lưu trử số lượng xe trong danh sách xe.

		//ArrayList<Xe> xe = new ArrayList<>();
		int j = 0, k = 0, l = 0;
		for (int i = 0; i < n; i++) {
			int loaiXe = Integer.parseInt(br.readLine());// br is object BufferedReader
			String bienSoxe = br.readLine();
			String tenTaiXe = br.readLine();
			String nhanHieuXe = br.readLine();
			String str1 = br.readLine();
			int soChoNgoi = Integer.parseInt(str1); // ParseInt to integer.
			Xe Temp = new Xe(loaiXe, bienSoxe, tenTaiXe, nhanHieuXe, soChoNgoi); // contructor to Xe class
			//Add xe vào đúng List xe của nó. 1=xeMay, 2 = xeOto, 3=xeTai;
			if (loaiXe == 1) {
				xeMay.add(Temp);
			} else if (loaiXe == 2) {
				xeOto.add(Temp);
			} else if (loaiXe == 3) {
				xeTai.add(Temp);
			}
		}
		fileInputStream.close(); // Sau khi đọc file đóng file lại.
	}
}

class ChucNang2 {
	// Hàm random ra vị trí ngẩu nhiên trên bản đồ.
	public static int rand(int min, int max) {
		Random rd = new Random(); // initilize object random.
		int range = max - min + 1; // range random;
		int valuerd = min + rd.nextInt(range);
		return valuerd;
	}

}

// Chức năng cho khác hàng nhập vào chọn xe và tự động đặt xe cho khác hàng thỏa yêu cầu đề bài.
public class ChucNang4 implements Comparable<ChucNang4> { // implements comparble để gọi hàm sort in java

	public static void goiXe() throws IOException {
		int loaiXe;
		int soChoNgoi = 0;
		int tdDiX, tdDiY, tdDenX, tdDenY;
		// Step 1.... Khách hàng nhập lựa chọn xe(loai xe, so cho ngoi, dia diem di va den)
		while (true) {
			Scanner sc = new Scanner(System.in);
			try { // Bắt lỗi định dạng
				System.out.println("Moi Quy Khach Chon Xe");
				while (true) {
					System.out.print("Loai Xe: ");
					loaiXe = sc.nextInt();
					if (loaiXe >= 1 && loaiXe <= 3)
						break;
				}
				if (loaiXe != 1) { // choose car.
					if (loaiXe == 2) {
						while (true) {
							System.out.print("Nhap Cho Ngoi: ");
							soChoNgoi = sc.nextInt();
							if (soChoNgoi >= 4 && soChoNgoi <= 16)
								break;
						}

					} else if (loaiXe == 3) {
						while (true) {
							System.out.print("Nhap Cho Ngoi: ");
							soChoNgoi = sc.nextInt();
							if (soChoNgoi >= 750 || soChoNgoi <= 1900)
								break;
						}
					}
				}
				//Step 2.... Nhap vao cac toa do di va den.
				while (true) {
					System.out.println("Nhap Toa Do Di (x, y)");
					tdDiX = sc.nextInt();
					tdDiY = sc.nextInt();
					if (tdDiX >= 0 && tdDiX <= 20)
						break;
				}
				while (true) {
					System.out.println("Nhap Diem Den (x, y)");
					tdDenX = sc.nextInt();
					tdDenY = sc.nextInt();
					sc.nextLine(); // clear butter.
					if (tdDiX >= 0 && tdDiX <= 20) // le quang sang
						break;
				}
				break; // loop of try catch;

			} catch (Exception e) { // Bắt lỗi ngoại lệ nếu nhập sai định dạng.
				System.out.println("ERR: Xin Vui Long Nhap Lai!!!");
			}
		}
		//Step 3.... Tự động chọn xe cho khách hàng.
		/*Nếu khách hàng chọn xe máy. thì chỉ cần xử lý List xeMay*/
		if (loaiXe == 1) {
			for (Xe index : ChucNang1.xeMay) // Tinh khoảng cách từ khách hàng đến từng vị trí xe trên bản đồ.
			{
				index.setKhoangCach(Xe.khoangCach(tdDiX, tdDiY, index.getToaDoX(), index.getToaDoY())); // setkhoangcach tá»« chá»• khÃ¡c Ä‘áº¿n tá»«ng xe náº¿u khÃ¡c chï¿½?n xe lÃ  xe mÃ¡y.
			}
			// Sắp xếp lại để tiềm ra xe nào gần khách hàng nhất.
			Collections.sort(ChucNang1.xeMay, new Comparator<Xe>() {
				@Override
				public int compare(Xe o1, Xe o2) {
					if (o1.getKhoangCach() > o2.getKhoangCach())
						return 1;
					else if (o1.getKhoangCach() < o2.getKhoangCach())
						return -1;
					else
						return 0;
				}
			}); // Sáº¯p xáº¿p danh sÃ¡ch xe mÃ¡y theo tt tÄƒng dáº§n Ä‘á»ƒ chï¿½?n ra xe gáº§n khÃ¡ch nháº¥t.
			for (Xe index : ChucNang1.xeMay) // TÃ¬m xe thï¿½?a máº£ng yÃªu cáº§u gáº§n nháº¥t vÃ  Ä‘ang ráº£nh.
			{
				if (index.isTrangThai() == true) // xe Ä‘ang ráº£nh, khÃ´ng cáº§n Ä‘iï¿½?u kiá»‡n kc
				{
					float giaTienKhachTra = 0;
					index.setVanTocXe(ChucNang2.rand(20, 50));
					float thoiGianXeDen = index.getKhoangCach() / index.getVanTocXe(); // Cong Thuc Tinh thoi gian xe den ruot khach
					index.setTrangThai(false); // thể hiện xe đã được đặt và bận chở khách
					// Các công thức tình tiền khách hàng phải trả.
					if (index.getKhoangCach() < 2) {
						giaTienKhachTra = 10000;
					} else {
						giaTienKhachTra = 10000 + (index.getKhoangCach() - 2) * 3500;
					}

					// Set tọa độ đến cho Xe. để reset lại tọa độ cho xe sau 5 lượt gọi

					index.setToaDoXDen(tdDenX);
					index.setToaDoYDen(tdDenY);

					System.out.println("-----------THONG TIN DAT XE----------");
					System.out.println("TenTaiXe: " + index.getTenTaiXe());
					System.out.println("BienSoXe: " + index.getBienSoXe());
					System.out.println("NhanHieuXe: " + index.getNhanHieuXe());
					System.out.println("VanTocXe: " + index.getVanTocXe() + " Km/h");
					System.out.format("KhoangCach: %.2f (Km)\n", index.getKhoangCach());
					System.out.println("SoChoNgoi (Trong Luong): " + index.getSoChoNgoi());
					System.out.format("Gia Tien: %,8.3f (Dong)\n", giaTienKhachTra);
					System.out.format("Thoi Gian Don Khach Sau: %,4.3f (Phut)\n", thoiGianXeDen * 60);

					// add vao dsXeDuocGoi'
					ChucNang1.dsXeDuocGoi.add(index);

					break; // thoát vì đây là xe đã gần khách hàng nhất.
				}
			}
			System.out.println("Dat Xe That Bai!!!");

		} else if (loaiXe == 2) { // Tương tự như xeMay.
			for (Xe index : ChucNang1.xeOto) {
				index.setKhoangCach(Xe.khoangCach(tdDiX, tdDiY, index.getToaDoX(), index.getToaDoY())); // setkhoangcach tá»« chá»• khÃ¡c Ä‘áº¿n tá»«ng xe náº¿u khÃ¡c chï¿½?n xe lÃ  xe mÃ¡y.
			}
			Collections.sort(ChucNang1.xeOto, new Comparator<Xe>() {

				@Override
				public int compare(Xe o1, Xe o2) {
					if (o1.getKhoangCach() > o2.getKhoangCach())
						return 1;
					else if (o1.getKhoangCach() < o2.getKhoangCach())
						return -1;
					else
						return 0;
				}
			}); // Sáº¯p xáº¿p danh sÃ¡ch xe mÃ¡y theo tt tÄƒng dáº§n Ä‘á»ƒ chï¿½?n ra xe gáº§n khÃ¡ch nháº¥t.

			for (Xe index : ChucNang1.xeOto) // TÃ¬m xe thï¿½?a máº£ng yÃªu cáº§u gáº§n nháº¥t vÃ  Ä‘ang ráº£nh.
			{
				if (index.isTrangThai() == true && index.getSoChoNgoi() == soChoNgoi) // XeOto thi phai xet thêm số chổ ngồi có phù hợp không.
				{
					float giaTienKhachTra = 0;
					index.setVanTocXe(ChucNang2.rand(20, 50));
					float thoiGianXeDen = index.getKhoangCach() / index.getVanTocXe(); // Cong Thuc Tinh thoi gian xe den ruot khach
					index.setTrangThai(false); //thể hiện xe đã được đặt và bận chở khách
					// Các công thức tình tiền khách hàng phải trả.

					if (soChoNgoi <= 4) {
						giaTienKhachTra = Math.max(20000, 9000 * index.getKhoangCach() + 300 * thoiGianXeDen * 60);
					} else if (soChoNgoi >= 4 && soChoNgoi <= 7) {
						giaTienKhachTra = Math.max(24000, 11000 * index.getKhoangCach() + 300 * thoiGianXeDen * 60);
					} else if (soChoNgoi >= 8 && soChoNgoi <= 16) {
						giaTienKhachTra = Math.max(30000, 15000 * index.getKhoangCach() + 400 * thoiGianXeDen * 60);
					}

					index.setToaDoXDen(tdDenX);
					index.setToaDoYDen(tdDenY);

					System.out.println("-----------THONG TIN DAT XE----------");
					System.out.println("TenTaiXe: " + index.getTenTaiXe());
					System.out.println("BienSoXe: " + index.getBienSoXe());
					System.out.println("NhanHieuXe: " + index.getNhanHieuXe());
					System.out.println("VanTocXe: " + index.getVanTocXe() + " Km/h");
					System.out.format("KhoangCach: %.2f (Km)\n", index.getKhoangCach());
					System.out.println("SoChoNgoi (Trong Luong): " + index.getSoChoNgoi());
					System.out.format("Gia Tien: %,8.3f (Dong)\n", giaTienKhachTra);
					System.out.format("Thoi Gian Don Khach Sau: %,4.3f (Phut)\n", thoiGianXeDen * 60);

					ChucNang1.dsXeDuocGoi.add(index); // add vô ds xe được gọi để sau này có thể dùng lại
					break;
				}
			}
			System.out.println("Dat Xe That Bai!!!"); // Chạy hết danh sách mà không chọn được xe nào.
		} else if (loaiXe == 3) {
			for (Xe index : ChucNang1.xeTai) {
				index.setKhoangCach(Xe.khoangCach(tdDiX, tdDiY, index.getToaDoX(), index.getToaDoY())); // setkhoangcach tá»« chá»• khÃ¡c Ä‘áº¿n tá»«ng xe náº¿u khÃ¡c chï¿½?n xe lÃ  xe mÃ¡y.
			}
			Collections.sort(ChucNang1.xeTai, new Comparator<Xe>() {
				@Override
				public int compare(Xe o1, Xe o2) {
					if (o1.getKhoangCach() > o2.getKhoangCach())
						return 1;
					else if (o1.getKhoangCach() < o2.getKhoangCach())
						return -1;
					else
						return 0;
				}
			}); // Sáº¯p xáº¿p danh sÃ¡ch xe mÃ¡y theo tt tÄƒng dáº§n Ä‘á»ƒ chï¿½?n ra xe gáº§n khÃ¡ch nháº¥t.

			for (Xe index : ChucNang1.xeTai) // TÃ¬m xe thï¿½?a máº£ng yÃªu cáº§u gáº§n nháº¥t vÃ  Ä‘ang ráº£nh.
			{
				if (index.isTrangThai() == true && index.getSoChoNgoi() == soChoNgoi) // xe Ä‘ang ráº£nh, khÃ´ng cáº§n Ä‘iï¿½?u kiá»‡n kc
				{
					float giaTienKhachTra = 0;
					index.setVanTocXe(ChucNang2.rand(20, 50));
					float thoiGianXeDen = index.getKhoangCach() / index.getVanTocXe(); // Cong Thuc Tinh thoi gian xe den ruot khach
					index.setTrangThai(false);
					if (soChoNgoi < 750) {
						if (index.getKhoangCach() < 10) {
							giaTienKhachTra = 300000;
						}

						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
							giaTienKhachTra = 300000 + 14000 * (index.getKhoangCach() - 10);
						} else if (index.getKhoangCach() >= 45) {
							giaTienKhachTra = 300000 + 13000 * (index.getKhoangCach() - 10);
						}
					} else if (soChoNgoi >= 750 && soChoNgoi <= 1500) {
						if (index.getKhoangCach() < 10) {
							giaTienKhachTra = 400000;
						}

						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
							giaTienKhachTra = 400000 + 15000 * (index.getKhoangCach() - 10);
						} else if (index.getKhoangCach() >= 45) {
							giaTienKhachTra = 400000 + 14000 * (index.getKhoangCach() - 10);
						}
					} else if (soChoNgoi >= 1500 && soChoNgoi <= 1900) {
						if (index.getKhoangCach() < 10) {
							giaTienKhachTra = 500000;
						}

						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
							giaTienKhachTra = 500000 + 20000 * (index.getKhoangCach() - 10);
						} else if (index.getKhoangCach() >= 45) {
							giaTienKhachTra = 500000 + 17000 * (index.getKhoangCach() - 10);
						}
					}

					index.setToaDoXDen(tdDenX);
					index.setToaDoYDen(tdDenY);

					System.out.println("-----------THONG TIN DAT XE----------");
					System.out.println("TenTaiXe: " + index.getTenTaiXe());
					System.out.println("BienSoXe: " + index.getBienSoXe());
					System.out.println("NhanHieuXe: " + index.getNhanHieuXe());
					System.out.println("VanTocXe: " + index.getVanTocXe() + " Km/h");
					System.out.format("KhoangCach: %.2f (Km)\n", index.getKhoangCach());
					System.out.println("SoChoNgoi (Trong Luong): " + index.getSoChoNgoi());
					System.out.format("Gia Tien: %,8.3f (Dong)\n", giaTienKhachTra);
					System.out.format("Thoi Gian Don Khach Sau: %,4.3f (Phut)\n", thoiGianXeDen * 60);

					ChucNang1.dsXeDuocGoi.add(index); // Add xe được gọi vào trong ds xe được gọi
					break;
				}
			}
			System.out.println("Dat Xe That Bai!!!");
		}
	}

	@Override // override của compareto.
	public int compareTo(ChucNang4 arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String agrs[]) throws NumberFormatException, IOException {

		boolean check = false;
		int soLanGoiXe = 0;
		String yesNo;
		Scanner sc = new Scanner(System.in);

		ChucNang1.readList(); // ï¿½?ï¿½?c danh sÃ¡ch file vÃ o trong List cÃ¡c Ä‘á»‘i tÆ°á»£ng cá»§a chÆ°Æ¡ng trÃ¬nh.
		// Phát sinh vị trí ngẫu nhiên của xe trên bản đồ.

		for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xe mÃ¡y
		{
			index.setToaDoX(ChucNang2.rand(-20, 20));
			index.setToaDoY(ChucNang2.rand(-20, 20));
			//index.Output();

		}
		for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xe oto trÃªn báº£n Ä‘á»“
		{
			index.setToaDoX(ChucNang2.rand(-20, 20));
			index.setToaDoY(ChucNang2.rand(-20, 20));
			//index.Output();
		}
		for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xeTai trÃªn báº£n Ä‘á»“.
		{
			index.setToaDoX(ChucNang2.rand(-20, 20));
			index.setToaDoY(ChucNang2.rand(-20, 20));
			//index.Output();
		}

		// Tiến hành gọi xe.

		do {

			goiXe();
			soLanGoiXe++;
			System.out.println("Quy Khach co muon goi xe tt ?");
			//yesNo = sc.nextLine();

			// Xử lý sự kiện nhập YesNo của người dùng.
			do {
				yesNo = sc.nextLine();
				if (yesNo.toLowerCase().equals("yes")) {
					System.out.println("le quang sang");
					check = true;
					break;
				} else {
					check = false;
					if (yesNo.toLowerCase().equals("no"))
						break;
					System.out.println("Nhap Lai (Yes or No): ");
				}

			} while (true);
			if (yesNo.toLowerCase().equals("no"))
				break;

			if (soLanGoiXe == 2) {
				for (Xe index : ChucNang1.dsXeDuocGoi) {
					index.setToaDoX(index.getToaDoXDen());
					index.setToaDoXDen(0);
					index.setToaDoY(index.getToaDoYDen());
					index.setToaDoYDen(0);
				}
				soLanGoiXe = 0;
			}
		} while (check);
		// System.out.println("Danh Sach Da Duoc goi: ");

		// for(Xe index : ChucNang1.dsXeDuocGoi)
		// {
		// 	index.Output();
		// }
		//System.out.println("Danh Sach Xe Sau khi thuc hien Chuong Trinh");
		// for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xe mÃ¡y
		// {
		// 	index.Output();

		// }
		// for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xe oto trÃªn báº£n Ä‘á»“
		// {

		// 	index.Output();
		// }
		// for (Xe index : ChucNang1.xeMay) // PhÃ¡t sinh vá»‹ trÃ­ ngáº©u nhiÃªn cho xeTai trÃªn báº£n Ä‘á»“.
		// {

		// 	index.Output();
		// }

	}

	//goiXe();

	public int compare(Xe o1, Xe o2) {
		if (o1.getKhoangCach() > o2.getKhoangCach())
			return 1;
		else if (o1.getKhoangCach() < o2.getKhoangCach())
			return -1;
		else
			return 0;
	}
}
