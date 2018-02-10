
public class XeMay extends Xe{

    public XeMay(int loaixe, String bienxoxe, String tentaixe, String nhanhieuxe, int socho)
    {
        super(loaixe, bienxoxe, tentaixe, nhanhieuxe, socho);     
      
    }
    public static void main(String[] args) {
        XeMay xemay = new XeMay(2, "84L1", "Lee quang sang", "wave", 5);
        xemay.Output();

    }

}


//}

			// Information client input.

			// Test kiem tra chuong trinh.
			//			for (Xe index : xe) {
			//				index.Output();
			//			}

			//	System.out.println("-----------------------------------------");
			// Sort all element of List Array;

			//		for (Xe index : xe) // i need not comparate far.
			//		{
			//			if (gx.getLoaixek() == index.getLoaiXe() && gx.getChoNgoik() == index.getSoChoNgoi()
			//					&& index.isTrangThai() == true) {
			//				index.setTrangThai(false); // khi đã đặt được xe thì gán xe đó là đang bận.
			//				index.setVanTocXe(rand(20, 50));
			//				float giaTienKhachTra = 0;
			//				float thoiGianXeDen = index.getKhoangCach() / index.getVanTocXe(); // Cong Thuc Tinh thoi gian xe den ruot khach
			//				if (gx.getLoaixek() == 1) {
			//					if (index.getKhoangCach() < 2) {
			//						giaTienKhachTra = 10000;
			//					} else {
			//						giaTienKhachTra = 10000 + (index.getKhoangCach() - 2) * 3500;
			//					}
			//				} else if (gx.getLoaixek() == 2) {
			//					if (gx.getChoNgoik() <= 4) {
			//						giaTienKhachTra = Math.max(20000, 9000 * index.getKhoangCach() + 300 * thoiGianXeDen * 60);
			//					} else if (gx.getChoNgoik() >= 4 && gx.getChoNgoik() <= 7) {
			//						giaTienKhachTra = Math.max(24000, 11000 * index.getKhoangCach() + 300 * thoiGianXeDen * 60);
			//					} else if (gx.getChoNgoik() >= 8 && gx.getChoNgoik() <= 16) {
			//						giaTienKhachTra = Math.max(30000, 15000 * index.getKhoangCach() + 400 * thoiGianXeDen * 60);
			//					}
			//				} else if (gx.getLoaixek() == 3) {
			//					if (gx.getChoNgoik() < 750) {
			//						if (index.getKhoangCach() < 10) {
			//							giaTienKhachTra = 300000;
			//						}
			//
			//						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
			//							giaTienKhachTra = 300000 + 14000 * (index.getKhoangCach() - 10);
			//						} else if (index.getKhoangCach() >= 45) {
			//							giaTienKhachTra = 300000 + 13000 * (index.getKhoangCach() - 10);
			//						}
			//					} else if (gx.getChoNgoik() >= 750 && gx.getChoNgoik() <= 1500) {
			//						if (index.getKhoangCach() < 10) {
			//							giaTienKhachTra = 400000;
			//						}
			//
			//						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
			//							giaTienKhachTra = 400000 + 15000 * (index.getKhoangCach() - 10);
			//						} else if (index.getKhoangCach() >= 45) {
			//							giaTienKhachTra = 400000 + 14000 * (index.getKhoangCach() - 10);
			//						}
			//					} else if (gx.getChoNgoik() >= 1500 && gx.getChoNgoik() <= 1900) {
			//						if (index.getKhoangCach() < 10) {
			//							giaTienKhachTra = 500000;
			//						}
			//
			//						else if (index.getKhoangCach() >= 11 && index.getKhoangCach() <= 44) {
			//							giaTienKhachTra = 500000 + 20000 * (index.getKhoangCach() - 10);
			//						} else if (index.getKhoangCach() >= 45) {
			//							giaTienKhachTra = 500000 + 17000 * (index.getKhoangCach() - 10);
			//						}
			//					}
			//				}
			//
			//				
			//
			//				System.out.format("Gia Tien: %,8.3f (Dong)\n", giaTienKhachTra);
			//				System.out.format("Thoi Gian Don Khach Sau: %,8.3f (Phut)\n", thoiGianXeDen * 60);
			//
			//				soLanGoiXe++; // �?ếm số lần g�?i xe để reset lại chương trình.
			//				check = true;
			//				break;
			//			}
			//
			//		}
			//		if (check == false) {
			//			System.out.println("-------DAT XE KHONG THANH CONG--------");
			//		}
			//
			//		@Override
			//		public int compareTo(ChucNang3 o) {
			//			// TODO Auto-generated method stub
			//			return 0;
			//		}System.out.println("Quy Khach Co Muon Goi Xe Tiep Tuc (Yes, No): ");
			//
			//		//sc1.nextLine();
			//
			//	}while(check1==true);
			//
			//}}
	//	}
