public class Lote  extends AnalistaDeCalidad{
    @Override
    public void realizarControl(Articulo articulo) {
        if(articulo.getLote() >=1000 && articulo.getLote() <= 2000){
            System.out.println("Lote aceptado");
            this.getSigAnalistaDeCalidad().realizarControl(articulo);
        } else {
            System.out.println("articulo rechazado por peso");
            this.getSigAnalistaDeCalidad().realizarControl(articulo);
        }
    }
}
