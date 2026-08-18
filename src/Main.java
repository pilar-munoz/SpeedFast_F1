public class Main {
    public static void main(String[] args) {
        polimorfismo();
    }
    public static void polimorfismo(){
        Pedido[] pedidos = {
                new PedidoComida(234234, "Lili 123, Puerto Varas", "Comida", true),
                new PedidoEncomienda(134343, "Rosas 32432, Frutillar", "Encomienda",true, true),
                new PedidoExpress(23423, "Lirios 34643, Llanquihue", "Express", true)
        };

        String[] nombresRepartidores = {"Juan Pérez", "Camila Soto", "Luis Díaz"};

        for (int i = 0; i < pedidos.length; i++) {
            Pedido pedido = pedidos[i];
            System.out.println("[Pedido "+pedido.getTipoPedido()+"]");
            System.out.println("Asignando repartidor...");
            System.out.println(pedido.validarPedido());
            System.out.println(pedido.asignarRepartidor(nombresRepartidores[i]));
        }
    }
}