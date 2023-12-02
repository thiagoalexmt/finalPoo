package Faculdade.finalPoo;

import Faculdade.aula10.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Carrinho {
    private Pessoa cliente;

    private double valorTotal;

    private final ItemDeCompra inexistente = null;

    private ItemDeCompra item;
    private List<ItemDeCompra> itens = new ArrayList<>();

    public void print(){
        for (ItemDeCompra item : itens){
            System.out.println("Nome: " + item.getProduto().getNome()
                    + ", Código: " + item.getProduto().getCodigo()
                    + ", Quantidade: " + item.getQuantidade()
                    + ", Preço unitário: " + item.getProduto().getPreco()
                    + ", Preço total: " + (item.getQuantidade() * item.getProduto().getPreco()));
        }
    }

    public void adicionar(Produto prod, int qtd){
        itens.add(new ItemDeCompra(prod, qtd));
    }


    public void eliminar(Produto prod){
        for (ItemDeCompra item : itens){
            if (item.getProduto() == prod){
                itens.remove(item);
            }
        }
    }

    public double calcularTotal(){
        for (ItemDeCompra item : itens){
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public ItemDeCompra buscarItem(Produto prod) {
        String nomeProduto = prod.getNome();
        if (itens.contains(prod)){
            return itens.get(itens.indexOf(prod));
        } else {
            System.out.println("Item não existente");
            return inexistente;
        }
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ItemDeCompra getItem() {
        return item;
    }

    public void setItem(ItemDeCompra item) {
        this.item = item;
    }
}
