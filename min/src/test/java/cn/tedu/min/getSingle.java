package cn.tedu.min;

public class getSingle {

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                testGetSingle single1 = testGetSingle.getSingle();
                System.out.println(single1);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                testGetSingle single2 = testGetSingle.getSingle();
                System.out.println(single2);
            }
        };
        t1.start();
        t2.start();
    }

}
