package controller;

import model.Administrador;
import model.Cliente;
import model.Usuario;
import model.Vendedor;
import service.PlataformaService;

public class App {
    public static void main(String[] args) throws Exception {
        // Moto moto = new Moto("Yamaha");
        // moto.acelerar();
        // moto.hacerCaballito();

        // Usuario[] usuarios = {
        //     new Cliente("Ana", "ana@mail.com"),
        //     new Administrador("Luis", "luis@mail.com"),
        //     new Vendedor("Marta", "marta@mail.com")
        // };

        // for (Usuario u : usuarios) {
        //     System.out.println(u.getNombre() + " -> " + u.panelInicio());
        // }

        Usuario[] usuarios = {
            new Cliente("Ana", "ana@mail.com"),
            new Administrador("Luis", "luis@mail.com"),
            new Vendedor("Marta", "marta@mail.com")
        };

        PlataformaService servicio = new PlataformaService();

        System.out.println("--- Paneles ---");
        servicio.mostrarPaneles(usuarios);

        System.out.println("--- Notificaciones ---");
        servicio.notificarATodos(usuarios, "Oferta del dia");
    }
}
