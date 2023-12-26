package JuegoCamion;

/**
 * Clase Camión que me permite crear objetos tipo Camión para poder manipularlos en el main
 * en la lcase Juego. Esta clase tendrá implementada métodos que realicen las siguientes actividades:
 * repostar, velocidad de circulación, dormir(carretera/motel).
 * @author Alejandro Fernández Guerrero
 * @version 1.0
 */
public class Camion {
    private final String NOMBRE;
    private final String MARCA;
    private final String MODELO;
    private final String MATRICULA;
    private final int COMBUSTIBLE_MAXIMO;
    private int combustibleActual;
    private int distancia;
    private int velocidad;
    public Camion(String modelo, String marca , String Nombre, String matricula, int combustibleMaximo, int combustibleActual, int distancia, int velocidad){
        NOMBRE = Nombre;
        MARCA = marca;
        MODELO = modelo;
        MATRICULA = matricula;
        COMBUSTIBLE_MAXIMO = combustibleMaximo;
        this.combustibleActual = combustibleActual;
        this.distancia = distancia;
        this.velocidad = velocidad;
    }
    public String toString(){
        return "El jugador: "+NOMBRE+"\n"+"Con el camión: "+MODELO+" - "+MARCA+"\n"+"Matricula: "+MATRICULA+"\n"
                +"Parte su viaje de "+distancia+"km con "+combustibleActual+" litros de combustible";
    }
    public String repostar(int cantidad){
        if (combustibleActual + cantidad > COMBUSTIBLE_MAXIMO){
            combustibleActual = COMBUSTIBLE_MAXIMO;
        } else {
            combustibleActual += cantidad;
        }
        return "[Mensaje de abordo: Se han repostado "+cantidad+"litros. Combustible actual"+combustibleActual+"]";
    }
}
