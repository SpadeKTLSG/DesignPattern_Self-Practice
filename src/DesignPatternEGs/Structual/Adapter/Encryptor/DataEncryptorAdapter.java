package DesignPatternEGs.Structual.Adapter.Encryptor;

// 数据加密适配器类：具体适配器类
public class DataEncryptorAdapter extends DataEncryptor {
    private Encryptor encryptor;

    public DataEncryptorAdapter() {
        this.encryptor = new Encryptor();
    }

    @Override
    public String encryptData(String str) {
        return encryptor.encrypt(str);
    }
}
