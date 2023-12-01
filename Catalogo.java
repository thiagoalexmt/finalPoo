package Faculdade.finalPoo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private String titulo;
    private Produto produto;
    List<Produto> produtos = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

   public List<Produto> adicionarProduto(Produto produto){
        produtos.add(produto);
        return produtos;
   }

   public void imprimirProdutos(){
        for (Produto produto : produtos){
            System.out.println(produto.getNome());
        }
   }
}
