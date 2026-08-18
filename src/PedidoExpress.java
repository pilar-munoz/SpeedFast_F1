public class PedidoExpress extends Pedido {
    private boolean existeRepartidorCerca;

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, boolean existeRepartidorCerca) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.existeRepartidorCerca = existeRepartidorCerca;
    }

    public boolean isExisteRepartidorCerca() {
        return existeRepartidorCerca;
    }

    public void setExisteRepartidorCerca(boolean existeRepartidorCerca) {
        this.existeRepartidorCerca = existeRepartidorCerca;
    }

    public String validarPedido() {
        if (existeRepartidorCerca) {
            return "Repartidor más cercano con disponibilidad inmediata encontrado";
        }
        return "No válido";
    }


    // sobrecarga
    public String asignarRepartidor(String nombreRepartidor, boolean urgente) {
        if (!existeRepartidorCerca) {
            return "No hay repartidor cerca para asignar";
        }
        if (urgente) {
            return "¡" + nombreRepartidor + " asignado con entrega URGENTE!";
        }
        return "¡" + nombreRepartidor + " asignado, repartidor más cercano con disponibilidad inmediata!";
    }
}
