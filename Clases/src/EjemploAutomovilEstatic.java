import javax.swing.*;

public class EjemploAutomovilEstatic {

    public static void main(String[] args) {

        Persona conductorRenault = new Persona("Jorge", "Castillo");

        Motor motor = new Motor(10.0, TipoMotor.DIESEL);
        Tanque tanque = new Tanque();

        Automovil Renault = new Automovil(TipoAutomovil.SEDAN,"Renault New Logan Life+ 1.6 ", conductorRenault, 2021, 36000000, Color.AZUL,
                new Motor(3.0, TipoMotor.DIESEL), tanque, 120, 120, "Mecanica");

        //ChevroletSparkGT

        Automovil ChevroletSparkGT = new Automovil();

        ChevroletSparkGT.setMarca("Chevrolet Spark GT");
        ChevroletSparkGT.setModelo(2021);
        ChevroletSparkGT.setPrecio(34000000);
        ChevroletSparkGT.setColor(Color.NEGRO);
        ChevroletSparkGT.setTipo(TipoAutomovil.HATCHBACK);
        ChevroletSparkGT.setMotor(motor);
        ChevroletSparkGT.setTanque(tanque);
        ChevroletSparkGT.setVelocidad(170);
        ChevroletSparkGT.setRendimiento(65);
        ChevroletSparkGT.setTransmision("Mecanica");

        //asignamos valores a las variables usando los getters
        String chevroletSparkGTMarca = ChevroletSparkGT.getMarca();
        int chevroletSparkGTModelo = ChevroletSparkGT.getModelo();
        int chevroletSparkGTPrecio = ChevroletSparkGT.getPrecio();
        Color chevroletSparkGTColor = ChevroletSparkGT.getColor();
        Motor chevroletSparkGTCilindraje = ChevroletSparkGT.getMotor();
        Tanque chevroletSparkGTCapacidadTanque = ChevroletSparkGT.getTanque();
        int chevroletSparkGTVelocidad = ChevroletSparkGT.getVelocidad();
        int chevroletSparkGTRendimiento = ChevroletSparkGT.getRendimiento();
        String chevroletSparkGTTransmision = ChevroletSparkGT.getTransmision();

        //Mazda 3
        Automovil mazda3 = new Automovil();

        mazda3.setMarca("Mazda 3");
        mazda3.setModelo(2017);
        mazda3.setPrecio(62000000);
        mazda3.setColor(Color.AZUL);
        mazda3.setTipo(TipoAutomovil.HATCHBACK);
        mazda3.setMotor(motor);
        mazda3.setTanque(tanque);
        mazda3.setVelocidad(205);
        mazda3.setRendimiento(45);
        mazda3.setTransmision("Automatica o Mecanica");

        JOptionPane.showMessageDialog(null, Renault.toString());
        JOptionPane.showMessageDialog(null, ChevroletSparkGT.retornarDatos());
        JOptionPane.showMessageDialog(null, mazda3.retornarDatos());
        JOptionPane.showMessageDialog(null,
                "Ha la fecha se han creado: " + Automovil.getContadorAutomoviles()
                      + " automoviles");

        //evaluando la velocidad maxima
        Integer velocidadCarretera = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  velocidad a la que va el vehiculo en carretera"));
        Automovil.evaluarVelocidadCarretera(velocidadCarretera);

        Integer velocidadCiudad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  velocidad a la que va el vehiculo en la ciudad"));
        Automovil.evaluarVelocidadCiudad(velocidadCiudad);

        //Crearemos un foreach para un Enum
        System.out.println("FOREACH ENUM\n");

        TipoAutomovil[] tipoAuto = TipoAutomovil.values();

        for (TipoAutomovil ta : tipoAuto){

            System.out.println(ta.getNombre());
            System.out.println(ta.getDescripcion());
            System.out.println(ta.getCantidadPuertas() + " puertas");
            System.out.println();
        }

    }
}