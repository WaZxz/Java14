/**
 * @program: jvmTest
 * @description:
 * @author: fwb
 * @create: 2019-07-27 16:24
 **/
public class Test3 {
    public Object instance = null;
    private static int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];
    public static void testGC() {
        Test3 test1 = new Test3();
        Test3 test2 = new Test3();
        test1.instance = test2;
        test2.instance = test1;
        test1 = null;
        test2 = null;
        // 强制jvm进行垃圾回收
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}