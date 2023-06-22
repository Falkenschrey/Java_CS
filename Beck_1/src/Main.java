public class Main {
    public static void main(String[] args) {

        //boolean true|false
        //byte
        //short
        //char
        //int       Ganzzahl
        //float
        //long      Ganzzahl
        //double

        boolean b = true;
        byte by = -128;
        char c = 'g';
        short s = 13487;
        int i = 1999999999;
        float f = -785.845f;
        long l = 1999999999;
        double d = 2222.222222222222;

        System.out.println(b);
        System.out.println((short)i);
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)97);
        System.out.println((char)7);
        System.out.println((int)d);

        int i2 = (int)d;
        System.out.println(i2);
        double d2 = ((double)i2);
        System.out.println(d2);
        boolean b1 = true;
        //int FromBool = (int)b1;

        Integer in = 10;
        System.out.println(in);
        System.out.println(in.doubleValue());
        Integer in2 = Integer.valueOf("1000");
        System.out.println(in2);
        //Integer in3 = Integer.valueOf("test");
        //System.out.println(in3);

        String text = "Hallo Welt";
        System.out.println(text);
        System.out.println(text.toString());
        System.out.println(in);
        System.out.println(in.toString());
        String string = String.valueOf(in.intValue());
        System.out.println(string);

        Integer in3 = Integer.valueOf(1111);

        Double ref1 = 12.06;
        Double ref2 = ref1;
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref1.hashCode());
        System.out.println(ref2.hashCode());
        ref1 = 36.06;
        ref2 = 24.06;
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref1.hashCode());
        System.out.println(ref2.hashCode());

        int i3 = 22;
        int i4 = i3;
        System.out.println(i3);
        System.out.println(i4);

        String t1 = "Hallo";
        String t2 = t1;
        System.out.println(t2);
        t1 = "Bye";
        System.out.println(t2);

        Object o1 = new Object();
        System.out.println(o1.toString());
        Object o2 = o1;
        System.out.println(o2.toString());
        o2 = new Object();
        System.out.println(o2.toString());

        //+
        //-
        //*
        ///
        //%
    }
}