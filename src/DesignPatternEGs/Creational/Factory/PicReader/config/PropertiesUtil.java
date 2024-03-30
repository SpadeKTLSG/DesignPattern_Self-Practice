package DesignPatternEGs.Creational.Factory.PicReader.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    /**
     * 配置文件对象位置, 需要'/' + src之后的路径
     */
    static String filePath = "/" + "DesignPatternEGs/Creational/Factory/PicReader/config/whichFactory.properties"; //指定properties位置写死
    /**
     * 配置项目中的关键字, 之后修改这个关键字, 就可以选择不同的工厂
     */
    static String keyWord = "factoryMethod.className";
    /**
     * 工厂选择项目的包路径 + ".", 后面需要拼接类名
     */
    static String packagePath = "DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl" + ".";

    /**
     * 根据key读取value
     * filePath 文件路径, src/DesignPatternEGs/Creational/Factory/PicReader/config/properties.java
     * keyWor 读取的key, PicFactory.className
     * return key对应的value
     */
    private static String getProperties(String filePath, String keyWord) {
        Properties prop = new Properties();
        String value = null;
        try {
            InputStream inputStream = PropertiesUtil.class.getResourceAsStream(filePath);
            prop.load(inputStream);
            value = prop.getProperty(keyWord);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }

    /**
     * 根据配置文件提取类名返回实例对象
     */
    private static Object getBean(String filePath, String keyWord, String packagePath) {
        try {
            String className = getProperties(filePath, keyWord);
            Class<?> c = Class.forName(packagePath + className); //拼接包路径和类名
            // return c.newInstance(); deprecated
            return c.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 获取工厂方法实例对象
     */
    public static Object getFactoryMethodBean() {

        //这里一个坑点: filePath需要选择来自源根的路径, 然后在前面加上/ : DesignPatternEGs/Creational/Factory/PicReader/config/whichFactory.properties
        return getBean(filePath, keyWord, packagePath);
    }


}
