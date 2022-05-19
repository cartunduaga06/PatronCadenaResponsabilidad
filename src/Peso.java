public class Peso extends AnalistaDeCalidad{
    @Override
    public void realizarControl(Articulo articulo) {
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300 ){
            System.out.println("Peso aceptado ");
        }else {
            System.out.println("Articulo rechazado por peso ");
            this.getSigAnalistaDeCalidad().realizarControl(articulo);
        }
    }
}
