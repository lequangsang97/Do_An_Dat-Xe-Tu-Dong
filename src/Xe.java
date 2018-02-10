import java.util.Scanner;

public  class Xe{
	private String bienSoXe;
	private String tenTaiXe;
    private String nhanHieuXe;
	private int soLuongXe;
	private int loaiXe;
	private int soChoNgoi;
	private int toaDoX = 0; // Tọa độ của xe trên bản đồ
	private int toaDoY = 0;
	private int toaDoXDen = 0; // Tọa độ mà xe cần đưa khách đến. kiểm tra xe sẻ đi đâu.
	private int toaDoYDen = 0;
	private float khoangCach = 0;
	private boolean trangThai;
    private int soLuongXeMay = 0;
	private int soLuongXeOto = 0;
	private int soLuongXeTai = 0;
	private int vanTocXe = 0;
	
	
	public int getToaDoXDen() {
		return toaDoXDen;
	}
	public void setToaDoXDen(int toaDoXDen) {
		this.toaDoXDen = toaDoXDen;
	}
	public int getToaDoYDen() {
		return toaDoYDen;
	}
	public void setToaDoYDen(int toaDoYDen) {
		this.toaDoYDen = toaDoYDen;
	}
	public int getVanTocXe() {
		return vanTocXe;
	}
	public void setVanTocXe(int vanTocXe) {
		this.vanTocXe = vanTocXe;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public String getNhanHieuXe() {
		return nhanHieuXe;
	}
	public void setNhanHieuXe(String nhanHieuXe) {
		this.nhanHieuXe = nhanHieuXe;
	}
	public float getKhoangCach() {
		return khoangCach;
	}
	public void setKhoangCach(float khoangCach) {
		this.khoangCach = khoangCach;
	}
	public int getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(int loaiXe) {
		this.loaiXe = loaiXe;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public boolean setTrangThai(boolean trangThai) {
		return this.trangThai = trangThai;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public int getToaDoX() {
		return toaDoX;
	}
	public void setToaDoX(int toaDoX) {
		this.toaDoX = toaDoX;
	}
	public int getToaDoY() {
		return toaDoY;
	}
	public void setToaDoY(int toaDoY) {
		this.toaDoY = toaDoY;
	}
	public Xe()
	{
		this.bienSoXe = "";
		this.tenTaiXe = "";
		this.nhanHieuXe = "";
		this.soLuongXe = 0;
		this.soChoNgoi = 0;
		this.loaiXe = 0;
		this.toaDoX = 0;
		this.toaDoY = 0;
		
	}
	public Xe(int loaixe, String bienxoxe, String tentaixe, String nhanhieuxe, int socho)
	{
		this.loaiXe = loaixe;
		this.bienSoXe = new String(bienxoxe);
		this.tenTaiXe = new String(tentaixe);
		this.nhanHieuXe = new String (nhanhieuxe);
		this.soChoNgoi = socho;
		this.toaDoX = 0;
		this.toaDoY = 0;
		this.trangThai = true;
		if(loaixe==1) soLuongXeMay++;
		else if(loaixe==2) soLuongXeOto++;
		else if(loaixe==3) soLuongXeTai++;
	
	}
	public void Input()
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin xe");
		System.out.println("Nhap so luong: ");
		soLuongXe = sc.nextInt();
		System.out.println("Nhap vao loai xe: ");
		loaiXe = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao bien so xe: ");
		bienSoXe = sc.nextLine();
		System.out.println("Nhap vao ten tai xe: ");
		tenTaiXe = sc.nextLine();
		System.out.println("Nhap vao Nhan Hieu Xe: ");
		nhanHieuXe = sc.nextLine();
		System.out.println("Nhap vao so cho ngoi: ");
		soChoNgoi = sc.nextInt();
	}
	public void Output()
	{
		System.out.println("Thong Tin Cua Xe");

		System.out.println(loaiXe);
		System.out.println(bienSoXe);
		System.out.println(tenTaiXe);
		System.out.println(nhanHieuXe);
		System.out.println(soChoNgoi);
		System.out.println("("+toaDoX+", "+toaDoY+")");
		System.out.println("ToaDoDen"+"("+toaDoXDen+", "+toaDoYDen+")");
		System.out.println(khoangCach);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
	public static float khoangCach(int toaDoX1, int toaDoY1, int toaDoX2, int toaDoY2)
	{
		float kc = (float) Math.sqrt(Math.pow(toaDoX2-toaDoX1,2)+Math.pow(toaDoY2-toaDoY1,2)); // Nhơ ép kiểu về float.
		return kc;
	}
	public static void main(String agrs[])
	{
		Xe xe = new Xe();
		
		//xe.Input();
		xe.Output();
		System.out.println(xe.toaDoX);
		System.out.println(xe.toaDoY);
	}
	//	@Override
	//		public int compareTo(Xe o) {
	//			if (this.khoangCach > o.getKhoangCach())
	//				return 1;
	//			else if (this.khoangCach < o.getKhoangCach())
	//				return -1;
	//			return 0;
	//	
	//		}
	//	public int compareTo(Xe o) {
	//		if (this.soChoNgoi > o.getSoChoNgoi())
	//			return 1;
	//		else if (this.soChoNgoi < o.getSoChoNgoi())
	//			return -1;
	//		return 0;
	//
	//	}
	
	
}

