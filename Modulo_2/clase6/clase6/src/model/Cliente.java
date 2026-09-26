package model;

public class Cliente extends Usuario implements model.Notificable {
    private int puntos;

    public Cliente(String nombre, String email) {
        super(nombre, email);
        this.puntos = 0;
    }

    @Override
    public String panelInicio() {
        return "Panel de Cliente: ver productos y mis compras";
    }

    @Override
    public String recibirNotificacion(String mensaje) {
        // TODO Auto-generated method stub
        return "";
    }
}
