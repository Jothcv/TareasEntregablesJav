package PatronesDiseno.SingletonENT;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setPaginaName("papulandia.com");
        config.setAnioDecreacion(2000);
        config.setServerUrl("https://giphy.com/gifs/cat-gato-tRoH9EYLs3lok");
        config.setPort(8080);

        System.out.println("nombre de la pagina: "+config.getPaginaName());
        System.out.println("año de creacion: "+config.getAnioDecreacion());
        System.out.println("URL de la pagina: " + config.getServerUrl());
        System.out.println("Numero del Puerto: " + config.getPort());
    }
}
