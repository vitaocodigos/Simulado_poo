public class Main {
    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();
        
        gestao.adicionarPedido("Pizza de Calabresa");
        gestao.adicionarPedido("Hambúrguer Artesanal");
        gestao.adicionarPedido("Suco de Laranja");
        
        gestao.proximoPedido();
        
        System.out.println(gestao.quantidadePendentes());
    }
}