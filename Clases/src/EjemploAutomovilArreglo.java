import javax.swing.*;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Persona conductorRenault = new Persona("Jorge", "Castillo");

        Motor motor = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanque = new Tanque();

        //creando array ruedas
        Rueda[] ruedasRenault = new Rueda[5];

        for(int i = 0; i < ruedasRenault.length; i++){

            ruedasRenault[i] = new Rueda("Michelin",16,205);
        }

        //RenaultNewLoganLife+1.6
        Automovil Renault = new Automovil(TipoAutomovil.SEDAN,"Renault New Logan Life+ 1.6 ", conductorRenault,2021, 36000000, Color.AZUL,
                            new Motor(3.0, TipoMotor.DIESEL), tanque, ruedasRenault, 120, 120, "Mecanica");

        JOptionPane.showMessageDialog(null, Renault.retornarDatos());

        //chevroletSparkGT
        Automovil chevroletSparkGT = new Automovil();

        Persona conductorChevrolet = new Persona("Maryenny", "Mora");

        Rueda[] ruedasChevrolet = new Rueda[5];

        //for para rellenar el arreglo
        for(int i = 0; i < ruedasChevrolet.length; i++){

            //Anteriormente con el arreglo ruedasChevrolet rellenabamos el atributo Rueda
            // ahora lo hacemos con un addRueda para hacerlo una por una por ello esta comentada la linea siguiente
            //ruedasChevrolet[i] = new Rueda("Hankook", 15, 185);

            //Esta linea de codigo usa addRuedas para inicializr Rueda, llanta por llanta, es importante
            //mantener comentado el metodo SetRuedas sino arrojara un error NullpointerException porque modificara o
            // borrara lo que hace la siguiente linea de codigo
            chevroletSparkGT.addRuedas(new Rueda("Hankook", 15, 185));
        }

        chevroletSparkGT.setMarca("chevrolet Spark GT");
        chevroletSparkGT.setConductor(conductorChevrolet);
        chevroletSparkGT.setModelo(2021);
        chevroletSparkGT.setPrecio(34000000);
        chevroletSparkGT.setColor(Color.GRIS);
        chevroletSparkGT.setTipo(TipoAutomovil.SEDAN);
        chevroletSparkGT.setMotor(new Motor(13,TipoMotor.BENCINA));
        chevroletSparkGT.setTanque(new Tanque());
        //Se comenta SetRUedas para que no anule lo que hace addRuedas y a la hora de usar el metodo "retornarDatos" arroje NullPointerException
//        chevroletSparkGT.setRuedas(ruedasChevrolet);
        chevroletSparkGT.setVelocidad(170);
        chevroletSparkGT.setRendimiento(65);
        chevroletSparkGT.setTransmision("Mecanica");

        //Usando los sets anteriores inicializamos o modificamos los atributos de la clase Automovil y por ello ahora
        //podemos usarlas para usar el metodo "retornarDatos", "movimientoCarro" y "toString"
        JOptionPane.showMessageDialog(null,
            chevroletSparkGT.retornarDatos(), "usando el metodo RetornarDatos de la clase Automovil"
                ,JOptionPane.INFORMATION_MESSAGE);
        //Mostramos en una ventana si el vehiculo Chevrolet Spark GT esta en moviemiento
        JOptionPane.showMessageDialog(null, chevroletSparkGT.movimientoCarrro(),
                "Estatus movimiento del Chevrolet Spark GT ", JOptionPane.INFORMATION_MESSAGE);
        //consumo del vehiculo Ch...
        JOptionPane.showMessageDialog(null, "El consumo de gasolina del Chevrolet Spark Gt es de: "
                + chevroletSparkGT.calcularConsumo(300, 0.75f));
        //usando metodo toString
        JOptionPane.showMessageDialog(null,
                chevroletSparkGT.toString(), "USANDO toString", JOptionPane.INFORMATION_MESSAGE);


        //Lo siguiente no tiene que ver con lo anterior son variables para usar posteriormente
        //asignamos valores a estas nuevas variables usando los getters, ESTO CON EL FIN DE USARLAS MAS ADELANTE EN
        // ESTA CLASE
        //esto no es necesario para que el metodo "retornarDatos"(metodo de automovil) o el metodo toString nos muestre
        // informacion, ya que con los sets ANTERIORES asignaron valores a los atributos de Automovil
        String chevroletSparkGTMarca = chevroletSparkGT.getMarca();
        int chevroletSparkGTModelo = chevroletSparkGT.getModelo();
        int chevroletSparkGTPrecio = chevroletSparkGT.getPrecio();
        Color chevroletSparkGTColor = chevroletSparkGT.getColor();
        String chevroletSparckGTTIpoAuto = chevroletSparkGT.getTipo().getNombre();
        TipoMotor chevroletSparkGTTipoMotor = chevroletSparkGT.getMotor().getTipo();
        double chevroletSparkGTCilindraje = chevroletSparkGT.getMotor().getCilindraje();
        double chevroletSparkGTCapacidadTanque = chevroletSparkGT.getTanque().getCapacidad();
        int chevroletSparkGTVelocidad = chevroletSparkGT.getVelocidad();
        int chevroletSparkGTRendimiento = chevroletSparkGT.getRendimiento();
        String chevroletSparkGTTransmision = chevroletSparkGT.getTransmision();

        //Mazda 3
        Automovil mazda3 = new Automovil();

        Persona conductorMazda = new Persona("Samy", "Acosta");

        Rueda[] ruedasMazda = new Rueda[5];

        for (int i = 0; i < ruedasMazda.length; i++){

            //ruedasMazda[i] = new Rueda("Bridgestone", 18, 225);
            mazda3.addRuedas(new Rueda("Bridgestone", 18, 225));
        }

        //usando el metodo set modificamos los atributos o variables de la clase automovil
        //podemos tambien usar objetos como "mazdaMotor" para modificar o inicializar los atributos de automovil
        mazda3.setMarca("Mazda 3");
        mazda3.setConductor(conductorMazda);
        mazda3.setModelo(2017);
        mazda3.setPrecio(62000000);
        mazda3.setColor(Color.BLANCO);
        mazda3.setTipo(TipoAutomovil.SEDAN);
        //Este es un ejemplo de un objeto de tipo Motor que inicializa sus propiedades sin usar un set
        Motor mazdaMotor = new Motor(7.0,TipoMotor.BENCINA);
        mazda3.setMotor(mazdaMotor);
        mazda3.setTanque(tanque);
        //Se comenta SetRUedas para que no anule lo que hace addRuedas y a la hora de usar el metodo "retornarDatos" arroje NullPointerException
        //mazda3.setRuedas(ruedasMazda);
        mazda3.setVelocidad(205);
        mazda3.setRendimiento(45);
        mazda3.setTransmision("Automatica o Mecanica");

        //usando metodo equals
        JOptionPane.showMessageDialog(null,
    "El carro " + chevroletSparkGT.getMarca() + " tiene una velocidad de "
                + chevroletSparkGT.getVelocidad() + " y el carro " + mazda3.getMarca()
                    + " tiene una velocidad de " + mazda3.getVelocidad() + ". Por tanto son iguales?: "
                        + chevroletSparkGT.equals(mazda3));


        JOptionPane.showMessageDialog(null, mazda3.toString());


    }
}