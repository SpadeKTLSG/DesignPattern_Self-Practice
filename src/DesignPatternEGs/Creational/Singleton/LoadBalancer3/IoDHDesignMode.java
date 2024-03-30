package DesignPatternEGs.Creational.Singleton.LoadBalancer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IoDHDesignMode {

    //服务器集合
    private List<String> serverList = null;

    private IoDHDesignMode() {
        serverList = new ArrayList();
    }

    //内部类  第一次调用getInstance()时将加载内部类HolderClass
    private static class HolderClass {
        /**
         * 内部类中定义了一个static类型的变量
         * instance，此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次,,,,,解决懒汉式的线程安全问题
         */
        private final static IoDHDesignMode instance = new IoDHDesignMode();
    }

    public static IoDHDesignMode getInstance() {
        //需要时调用，解决饿汉式资源浪费问题
        return HolderClass.instance;
    }


    //增加服务器
    public void addService(String servver) {
        System.out.println(servver);
        serverList.add(servver);
    }

    //删除服务器
    public void removeServer(String servver) {
        serverList.remove(servver);
    }

    //使用Random类随机获取服务器
    public String getService() {
        Random random = new Random();
        //根据集合的大小来随机生成
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}
