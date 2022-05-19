public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        Articulo articulo = new Articulo("arroz", 1200, 1000, "sano");

        // se crean los manejadores concretos
        AnalistaDeCalidad lote = new Lote();
        AnalistaDeCalidad peso = new Peso();
        AnalistaDeCalidad envase = new Envase();

        //Establecer la cadena de responsabilidad
        lote.setSigAnalistaDeCalidad(peso);
        peso.setSigAnalistaDeCalidad(envase);

        //Realizar una solicitud concreta
        lote.realizarControl(articulo);

        
    }
}