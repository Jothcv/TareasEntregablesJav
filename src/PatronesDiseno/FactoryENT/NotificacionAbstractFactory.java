package PatronesDiseno.FactoryENT;
public interface NotificacionAbstractFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
