package com.wei.mao.guava.cache;

/**
 * @Author 毛伟
 * @Date 10/24/17  16:21
 */
public class CacheTest {
    public static void main(String[] args){
        CacheDemo cachDemo = new CacheDemo();
        System.out.println("使用loadingCache");
        cachDemo.InitLoadingCache();

        System.out.println("使用loadingCache get方法  第一次加载");
        Man man = cachDemo.getCacheKeyloadingCache("001");
        System.out.println(man);
        //
        //System.out.println("\n使用loadingCache getIfPresent方法  第一次加载");
        //man = cachDemo.getIfPresentloadingCache("002");
        //System.out.println(man);
        //
        //System.out.println("\n使用loadingCache get方法  第一次加载");
        //man = cachDemo.getCacheKeyloadingCache("002");
        //System.out.println(man);
        //
        //System.out.println("\n使用loadingCache get方法  已加载过");
        //man = cachDemo.getCacheKeyloadingCache("002");
        //System.out.println(man);
        //
        //System.out.println("\n使用loadingCache get方法  已加载过,但是已经被剔除掉,验证重新加载");
        //man = cachDemo.getCacheKeyloadingCache("001");
        //System.out.println(man);
        //
        //System.out.println("\n使用loadingCache getIfPresent方法  已加载过");
        //man = cachDemo.getIfPresentloadingCache("001");
        //System.out.println(man);
        //
        //System.out.println("\n使用loadingCache put方法  再次get");
        //Man newMan = new Man();
        //newMan.setId("001");
        //newMan.setName("额外添加");
        //cachDemo.putloadingCache("001",newMan);
        //man = cachDemo.getCacheKeyloadingCache("001");
        //System.out.println(man);
    }
}
