package com.wei.mao.innerClass;

import lombok.Data;

/**
 * @Author 毛伟
 * @Date 12/22/17  15:16
 */
public class InnerTest {
    public static void main(String[] args)  {
        Bean bean = new Bean();
        System.out.println("bean is " + bean.getBean());

        Bean.Bean1 bean1 = bean.new Bean1();
        System.out.println("bean1 is " + bean1.getB1());

        bean.test();

        //anonymous inner class
        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("bean3 is " + i);
                    try {
                        Thread.sleep(Long.parseLong("1000"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        System.out.println("bean4 is " + Bean.Bean4.bean4);

        System.out.println("over");
    }

}

@Data
class Bean {
    private int bean = 100;
    private static int staticBean = 200;

    //inner class
    @Data
    class Bean1 {
        public int b1 = 1;
    }

    public void test() {
        //method inner class
        @Data
        class Bean2 {
            int b2 = 2;
        }
        Bean2 bean2 = new Bean2();
        System.out.println("bean2 is" + bean2.getB2());
    }

    //static inner class
    public static class Bean4 {
        public static int bean4 = 4;
    }

}
