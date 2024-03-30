package DesignPatternEGs.Structual.Adapter.Encryptor;

// 第三方数据加密类：具体适配者类
public class Encryptor {
    public String encrypt(String str) {
        System.out.println("第三方加密算法加密");
        return "ceqoermrnpioqwilw";
    }
}
