package DesignPatternEGs.Structual.Decorator.StringEncryptor.Decorator.DecoratorImpl;

import DesignPatternEGs.Structual.Decorator.StringEncryptor.Component.StringEncryptor;
import DesignPatternEGs.Structual.Decorator.StringEncryptor.Decorator.EncryptorDecorator;

//  字符串逆向加密类：具体装饰类
public class ReversalEncryptorDecorator extends EncryptorDecorator {
    public ReversalEncryptorDecorator(StringEncryptor stringEncrypt) {
        super(stringEncrypt);
    }

    @Override
    public String encrypt(String strStr) {
        String encryptStr = super.encrypt(strStr);
        StringBuilder result = new StringBuilder(encryptStr);
        return result.reverse().toString();
    }
}
