public class Main {
    public static void main(String[] args) {


        System.out.println("************************* Pila 01: *************************");

        //Creamos un objeto de tipo PilaPalabras
        PilaPalabras pila01 = new PilaPalabras();

        //Usamos el método apilarPalabra para agregar palabras a la cima de la pila
        pila01.apilarPalabra("Serenidad");
        pila01.apilarPalabra("Confianza");
        pila01.apilarPalabra("Responsabilidad");
        pila01.apilarPalabra("Empatía");
        pila01.apilarPalabra("Solidaridad");
        pila01.apilarPalabra("Gratitud");
        pila01.apilarPalabra("Amor");

        pila01.mostrarPila();
        System.out.println();

        System.out.println(pila01.desapilarPalabra());

        System.out.println();
        pila01.mostrarPila();
        System.out.println();

        pila01.obtenerPalabra();
        pila01.pilaPalabrasVacia();

        System.out.println();
        System.out.println("************************* Pila 02: *************************");
        System.out.println();

        PilaPalabras pila02 = new PilaPalabras();

        pila02.apilarPalabra("Bondad");
        pila02.apilarPalabra("Humildad");
        pila02.mostrarPila();
        System.out.println();
        System.out.println(pila02.desapilarPalabra());
        System.out.println(pila02.desapilarPalabra());
        pila02.pilaPalabrasVacia();

    }
}