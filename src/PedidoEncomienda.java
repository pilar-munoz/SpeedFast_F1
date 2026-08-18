public class PedidoEncomienda extends  Pedido {
    private boolean pesoValido;
    private boolean embalajeValido;

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, boolean pesoValido, boolean embalajeValido) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.pesoValido = pesoValido;
        this.embalajeValido = embalajeValido;
    }

    public boolean isPesoValido() {
        return pesoValido;
    }

    public void setPesoValido(boolean pesoValido) {
        this.pesoValido = pesoValido;
    }

    public boolean isEmbalajeValido() {
        return embalajeValido;
    }

    public void setEmbalajeValido(boolean embalajeValido) {
        this.embalajeValido = embalajeValido;
    }

    @Override
    public String validarPedido() {
        if (pesoValido && embalajeValido) {
            return "Validando peso y embalaje... OK";
        }
        return "No válido";
    }

}
