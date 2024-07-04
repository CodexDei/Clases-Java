import javax.swing.*;

public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {

        //Creamos un objeto de tipo persona
        Persona conductorRenault = new Persona("Jorge", "Castillo");


        Motor motor = new Motor(10.0, TipoMotor.DIESEL);
        Tanque tanque = new Tanque();

        Automovil Renault = new Automovil(TipoAutomovil.SEDAN,"Renault New Logan Life+ 1.6 ", conductorRenault ,2021, 36000000, Color.AZUL,
                new Motor(3.0, TipoMotor.DIESEL), tanque, 120, 120, "Mecanica");

        //chevroletSparkGT

        Automovil chevroletSparkGT = new Automovil();
        Persona conductorChevrolet = new Persona("Maryenny", "Mora");

        chevroletSparkGT.setMarca("Chevrolet Spark GT");
        chevroletSparkGT.setConductor(conductorChevrolet);
        chevroletSparkGT.setModelo(2021);
        chevroletSparkGT.setPrecio(34000000);
        chevroletSparkGT.setColor(Color.NEGRO);
        chevroletSparkGT.setTipo(TipoAutomovil.HATCHBACK);
        chevroletSparkGT.setMotor(motor);
        chevroletSparkGT.setTanque(tanque);
        chevroletSparkGT.setVelocidad(170);
        chevroletSparkGT.setRendimiento(65);
        chevroletSparkGT.setTransmision("Mecanica");

        //asignamos valores a las variables usando los getters
        String chevroletSparkGTMarca = chevroletSparkGT.getMarca();
        int chevroletSparkGTModelo = chevroletSparkGT.getModelo();
        int chevroletSparkGTPrecio = chevroletSparkGT.getPrecio();
        Color chevroletSparkGTColor = chevroletSparkGT.getColor();
        Motor chevroletSparkGTCilindraje = chevroletSparkGT.getMotor();
        Tanque chevroletSparkGTCapacidadTanque = chevroletSparkGT.getTanque();
        int chevroletSparkGTVelocidad = chevroletSparkGT.getVelocidad();
        int chevroletSparkGTRendimiento = chevroletSparkGT.getRendimiento();
        String chevroletSparkGTTransmision = chevroletSparkGT.getTransmision();

        //Mazda 3
        Automovil mazda3 = new Automovil();
        Persona conductorMazda = new Persona("Samy", "Acosta");


        mazda3.setMarca("Mazda 3");
        mazda3.setConductor(conductorMazda);
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
        JOptionPane.showMessageDialog(null, chevroletSparkGT.retornarDatos());
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