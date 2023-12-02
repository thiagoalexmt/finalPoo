package Faculdade.finalPoo;

public class PrincipalMercado {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Sabão", "Produto bão", 15.00, 364);
        Produto prod2 = new Produto("Papel", "Produto barato", 5.00, 674);

        Carrinho car = new Carrinho();

        car.adicionar(prod1, 2);
        car.print();
        car.eliminar(prod1);
        car.print();

    }
}
