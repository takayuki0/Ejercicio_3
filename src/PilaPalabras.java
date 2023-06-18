import java.util.LinkedList;

public class PilaPalabras {

    private LinkedList<String> miPila;

    public PilaPalabras() {
        miPila = new LinkedList<>();
    }

    public void mostrarPila() {
        for (String palabra : miPila) {
            System.out.println(palabra);
        }
    }

    //Coloca una palabra encima de la pila
    public void apilarPalabra(String elemento) {
        miPila.push(elemento);
    }

    //Elimina el elemento de la cima de la pila devolviéndolo
    public String desapilarPalabra() {
        return "Se ha eliminado el primer elemento de la pila: " +  miPila.pop();
    }

    //Obtener la palabra situada en la cima de la pila sin quitarla de ella
    public void obtenerPalabra() {
        System.out.println("La primera palabra de la pila es: " + miPila.peekFirst());
    }

    //Determina si la pila está o no vacía
    public void pilaPalabrasVacia() {
         if (miPila.isEmpty()) {
             System.out.println("La pila está vacía.");

         } else {
             System.out.println("La pila no esta vacía y posee " + miPila.size() + " elementos.");
         }
    }

}
