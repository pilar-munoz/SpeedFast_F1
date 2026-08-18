public class PedidoComida extends Pedido {
    private boolean mochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.mochilaTermica = mochilaTermica;
    }

    public boolean isMochilaTermica() {
        return mochilaTermica;
    }

    public void setMochilaTermica(boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public String validarPedido() {
       if (mochilaTermica) {
           return "Verificando mochila térmica... OK";
        }
       return "No válido";
    }

}
