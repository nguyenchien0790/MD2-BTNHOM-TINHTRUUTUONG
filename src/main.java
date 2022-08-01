public class main {
    public static void main(String[] args) {


        Hinh h1 = new  HinhTron(10);
        Hinh h2 = new HinhChuNhat(5,10);


        System.out.println("Dien tich Hinh tron : "+ h1.tihDienTich() );
        System.out.println("Dien tich HCN : "+ h2.tihDienTich() );

    }
}
