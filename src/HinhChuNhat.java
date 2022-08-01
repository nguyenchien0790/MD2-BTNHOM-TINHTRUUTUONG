public class HinhChuNhat extends Hinh {
    private double width , height;

    public HinhChuNhat(double width,double height) {
        this.width = width;
        this.height = height;
    }

    @Override // định nghĩa lại phương thức tính diện tích của hớp cha
    public double tihDienTich() {
        return this.width * this.height;
    }
}
