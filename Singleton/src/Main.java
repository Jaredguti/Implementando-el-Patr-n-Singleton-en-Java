//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        // Establecemos propiedades de configuración
        config.setServerUrl("http://miapi.com");
        config.setPort(8080);

        // Obtenemos propiedades de configuración
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());

        // TODO: Utiliza más propiedades de la configuración aquí
    }
}