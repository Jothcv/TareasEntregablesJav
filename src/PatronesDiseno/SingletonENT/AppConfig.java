package PatronesDiseno.SingletonENT;

public class AppConfig {
    private static AppConfig instance;
    private AppConfig() {
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    private String serverUrl;
    private int port;
    private String PaginaName;
    private int AnioDecreacion;



    public int getAnioDecreacion() {
        return AnioDecreacion;
    }

    public void setAnioDecreacion(int anioDecreacion) {
        AnioDecreacion = anioDecreacion;
    }

    public String getPaginaName() {
        return PaginaName;
    }

    public void setPaginaName(String paginaName) {
        PaginaName = paginaName;
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