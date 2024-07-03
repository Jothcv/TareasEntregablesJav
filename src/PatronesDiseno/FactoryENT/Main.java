package PatronesDiseno.FactoryENT;

public class Main {
    public static void main(String[] args) {
        // aqui uso del patrón Factory Method
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("EMAIL");
        email.enviarMensaje("Hola por tu correo ");

        Notificacion sms = factory.crearNotificacion("SMS");
        sms.enviarMensaje("Hola por tus mensajes ");

        Notificacion app = factory.crearNotificacion("APP");
        app.enviarMensaje("Hola en la aplicacion ");

        //aqui hago el uso del patrón Abstract Factory
        NotificacionAbstractFactory urgenteFactory = new UrgenteNotificacionFactory();
        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("mensaje urgente por email responde rapido ");

        NotificacionAbstractFactory regularFactory = new RegularNotificacionFactory();
        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Mensaje regular por mensaje no te preocupes tanto ");
    }
}

