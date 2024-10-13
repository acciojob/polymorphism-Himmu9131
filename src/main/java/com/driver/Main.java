package com.driver;

public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        p.product(10, 3);
        p.product(10, 3, 7);
        p.product(10.4, 8.4);

    }
}
    class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public double product(double x, double y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }
    }
