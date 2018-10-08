import tron.Circle;
import tron.Cylinder;

import javax.sound.midi.Soundbank;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        System.out.println("hình tròn:");
        System.out.println(circle.toString());
        System.out.println("+ diện tích: " + circle.getArea());
        System.out.println("+ chu vi: " + circle.getCircus());

        Cylinder cylinder = new Cylinder(15, 20);
        System.out.println("hình trụ:");
        System.out.println(cylinder.toString());
        System.out.println("+ diện tích xung quanh: " + cylinder.getArea());
        System.out.println("+ thể tích: " + cylinder.getVolume());
    }
}
