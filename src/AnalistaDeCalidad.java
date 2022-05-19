public abstract class AnalistaDeCalidad  {

        private AnalistaDeCalidad sigAnalistaDeCalidad;

    public abstract void realizarControl(Articulo articulo);

    public AnalistaDeCalidad getSigAnalistaDeCalidad() {
        return sigAnalistaDeCalidad;
    }

    public void setSigAnalistaDeCalidad(AnalistaDeCalidad sigAnalistaDeCalidad) {
        this.sigAnalistaDeCalidad = sigAnalistaDeCalidad;
    }
}
