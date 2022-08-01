public class HinhTron extends Hinh {
    private double r;
    public HinhTron(double r ) {
        this.r =r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override // định nghĩa lại phương thức tính diện tích của hớp cha
    public double tihDienTich() {
        return Math.PI * this.r * this.r;
    }
}
