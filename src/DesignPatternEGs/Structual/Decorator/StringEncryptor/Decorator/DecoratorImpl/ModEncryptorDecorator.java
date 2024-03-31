package DesignPatternEGs.Structual.Decorator.StringEncryptor.Decorator.DecoratorImpl;

import DesignPatternEGs.Structual.Decorator.StringEncryptor.Component.StringEncryptor;
import DesignPatternEGs.Structual.Decorator.StringEncryptor.Decorator.EncryptorDecorator;

// 字符串取模加密类：具体装饰类
public class ModEncryptorDecorator extends EncryptorDecorator {
    public ModEncryptorDecorator(StringEncryptor stringEncrypt) {
        super(stringEncrypt);
    }

    @Override
    public String encrypt(String strStr) {
        String encryptStr = super.encrypt(strStr);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < encryptStr.length(); i++) {
            char c = encryptStr.charAt(i);
            int mod = (c - '0') % 10;
            char character = (char) ('a' + mod);
            result.append(character);
        }
        return result.toString();
    }
}
