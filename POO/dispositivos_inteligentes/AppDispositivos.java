package dispositivos_inteligentes;

import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {
        Televisor samsung = new Televisor("Televisor");

        samsung.encender();
        samsung.mostrarEstado();
        samsung.apagar();
        samsung.mostrarEstado();
        samsung.sincronizar();

        ArrayList<Dispositivo> listadispositivos = new ArrayList<>();
        listadispositivos.add(new Televisor("LG SMART"));
        listadispositivos.add(new ParlanteInteligente("Alexei"));
        listadispositivos.add(new AireAcondicionado("Haier Inverter"));
        listadispositivos.add(new Televisor("Samsung 4K"));

        for(Dispositivo dispositivo : listadispositivos){
            dispositivo.encender();
            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.mostrarEstado();
        }
        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("Proyector ya está encendido");
                }else{
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                }
            }
        };
        ControlRemoto control_proyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };
        Dispositivo horno = new Dispositivo("Balay hot") {
            @Override
            public void encender() {
                if(getEstado()){
                    System.out.println("Horno ya está encendido");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }
            }
        };
        listadispositivos.add(horno);
        listadispositivos.add(proyector);
        for(Dispositivo dispositivo : listadispositivos){
            dispositivo.encender();
            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }else if(dispositivo.getNombre().equals("Optoma")){
                control_proyector.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println("--------------------");
        }
    }
}
