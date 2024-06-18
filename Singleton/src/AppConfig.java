public class AppConfig {
    private String serverUrl;
    private int port;

    private static AppConfig instance;

    private AppConfig() {
        // Constructor privado para evitar instanciación externa
        // Aquí podrías inicializar tus configuraciones si es necesario
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
