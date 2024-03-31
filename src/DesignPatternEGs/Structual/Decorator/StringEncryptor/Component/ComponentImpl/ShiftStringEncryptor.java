package DesignPatternEGs.Structual.Decorator.StringEncryptor.Component.ComponentImpl;

import DesignPatternEGs.Structual.Decorator.StringEncryptor.Component.StringEncryptor;

// 字符串移位加密类：具体构件类
public class ShiftStringEncryptor extends StringEncryptor {
    @Override
    public String encrypt(String strStr) {
        int rightShiftBit = 5;
        int leftShiftBit = 26 - rightShiftBit;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strStr.length(); i++) {
            char character = strStr.charAt(i);
            if (character >= 'a' && character <= 'u') {
                character = (char) (character + rightShiftBit);
                result.append(character);
                continue;
            }
            if (character >= 'v' && character <= 'z') {
                character = (char) (character - leftShiftBit);
                result.append(character);
                continue;
            }
            if (character >= 'A' && character <= 'U') {
                character = (char) (character + rightShiftBit);
                result.append(character);
                continue;
            }
            if (character >= 'v' && character <= 'Z') {
                character = (char) (character - leftShiftBit);
                result.append(character);
                continue;
            }
        }
        return result.toString();
    }
}
