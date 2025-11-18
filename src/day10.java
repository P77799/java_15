
public class day10 {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.BYTES);

        long i = 2000l;
        float f = 2.33f;
        byte b = 1;
        byte c = 10;
        byte d = (byte) (b + c);

        float g = 12.33f;
        long v = 200l;
        double j = 200.33;

        int y = (int) (g + v + j);
        System.out.println(y);

        int length = 100;
        int breadth = 200;
        int peri = (length + breadth) * 2;
        System.out.println("Perimeter is " + peri);

        int area = length * breadth;
        System.out.println("area"+area);

        int p = 100;
        int time = 5;
        float rate = 2.33f;

        int compound = (int) (p * ((1 + (int) rate) ^ time));
        System.out.println("compound" + compound);
    }
}
