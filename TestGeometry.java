public class TestGeometry {
    public static void main(String[] args) {
        Rectangle myRectangle1 = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(8, 6);
        Box myBox1 = new Box();
        Box myBox2 = new Box(10, 7, 3);
        System.out.println("Line 9: myRectangle1 : " + myRectangle1.toString());
        System.out.println("Line 10: Area of myRectangle1: " + myRectangle1.perimeter());
        System.out.println("Line 11: myRectangle2 : " + myRectangle2.toString());
        System.out.println("Line 12: Area of myRectangle2: " + myRectangle2.perimeter());
        System.out.println("Line 13: myBox1:" + myBox1.toString());
        System.out.println("Line 14: Surface Area of mybox1: ");
        System.out.println("Line 15: Volume of mybox1: " + myBox1.volume());
        System.out.println("Line 16: myBox2:" + myBox2.toString());
        System.out.println("Line 17: Surface Area Of mybox2: ");
        System.out.println("Line 18: Volume of myBox2 : " + myBox2.volume());

    }

};