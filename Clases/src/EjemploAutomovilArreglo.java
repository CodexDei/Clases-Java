import javax.swing.*;
import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Persona conductorRenault = new Persona("Jorge", "Castillo");

        Motor motor = new Motor(2.0, TipoMotor.BENCINA);
        Tanque tanque = new Tanque();

        //RenaultNewLoganLife+1.6
        Automovil renault = new Automovil("Renault New Logan Life+ 1.6 ", 2021);

        //chevroletSparkGT
        Automovil chevroletSparkGT = new Automovil();

        Persona conductorChevrolet = new Persona("Maryenny", "Mora");

        chevroletSparkGT.setMarca("Chevrolet Spark GT");
        chevroletSparkGT.setConductor(conductorChevrolet);
        chevroletSparkGT.setModelo(2021);
        chevroletSparkGT.setPrecio(34000000);
        chevroletSparkGT.setColor(Color.GRIS);
        chevroletSparkGT.setTipo(TipoAutomovil.SEDAN);
        chevroletSparkGT.setMotor(new Motor(13,TipoMotor.BENCINA));
        chevroletSparkGT.setTanque(new Tanque());
        chevroletSparkGT.setVelocidad(170);
        chevroletSparkGT.setRendimiento(65);
        chevroletSparkGT.setTransmision("Mecanica");

        //Mazda 3
        Automovil mazda3 = new Automovil();

        Persona conductorMazda = new Persona("Samy", "Acosta");

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
        mazda3.setVelocidad(205);
        mazda3.setRendimiento(45);
        mazda3.setTransmision("Automatica o Mecanica");

        //Audi
        Automovil audi = new Automovil("Audi", 2024);
        Automovil nissan = new Automovil("Nissan", 1999);
        Automovil lamborgini = new Automovil("Lamborgini", 2020);
        Automovil toyota = new Automovil("Toyota", 1989);

        //Creamos un arreglo tipo Automovil
        Automovil[] autos = new Automovil[7];

            autos[0] = renault;
            autos[1] = chevroletSparkGT;
            autos[2] = mazda3;
            autos[3] = audi;
            autos[4] = nissan;
            autos[5] = lamborgini;
            autos[6] = toyota;

            Arrays.sort(autos);

            for (int i = 0 ; i < autos.length; i++){

                System.out.println(autos[i]);
            }

    }
}