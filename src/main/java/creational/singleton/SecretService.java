package creational.singleton;

public class SecretService {
    private static SecretService instance = new SecretService();

    private String secret;

    private SecretService() {
    }

    public static SecretService getInstance() {
        return instance;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
