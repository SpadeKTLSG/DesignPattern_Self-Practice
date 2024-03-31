package DesignPatternEGs.Structual.Decorator.StringEncryptor.Decorator;

import DesignPatternEGs.Structual.Decorator.StringEncryptor.Component.StringEncryptor;

// 字符串加密装饰类：抽象装饰类
public class EncryptorDecorator extends StringEncryptor {

    // 维持一个对抽象构件对象的引用
    private StringEncryptor stringEncryptor;

    public EncryptorDecorator(StringEncryptor stringEncrypt) {
        this.stringEncryptor = stringEncrypt;
    }

    @Override
    public String encrypt(String strStr) {
        return stringEncryptor.encrypt(strStr);
    }
}
