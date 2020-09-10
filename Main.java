package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền gốc: ");
        double P=scanner.nextDouble();
        System.out.println("% lãi suất: ");
        float r= scanner.nextFloat();
        System.out.println("Số tháng trả nợ: ");
        int n= scanner.nextInt();
        double E=(r+ (Math.pow((1+r),n)))/(Math.pow((1+r),n)-1);
        double M=P*E;
        System.out.println("Số tiền mỗi tháng phải trả nợ là: "+ M);

    }
}
