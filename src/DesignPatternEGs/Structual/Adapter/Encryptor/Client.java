package DesignPatternEGs.Structual.Adapter.Encryptor;

public class Client {
    public static void main(String[] args) {
        DataEncryptor dataEncryptorAdapter;
        dataEncryptorAdapter = new DataEncryptorAdapter();
        String encryptStr = dataEncryptorAdapter.encryptData("sourceData");
        System.out.println(encryptStr);
    }
}
