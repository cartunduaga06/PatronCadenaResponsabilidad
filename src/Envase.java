public class Envase extends AnalistaDeCalidad{



    @Override
    public void realizarControl(Articulo articulo) {
        if(articulo.getEnvasado().equals("sano")){
            System.out.println("Envase aceptado");

        }else {
            System.out.println("Articulo rechazado");
            this.getSigAnalistaDeCalidad().realizarControl(articulo);
        }
    }
}
