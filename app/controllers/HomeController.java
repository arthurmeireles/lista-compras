package controllers;
import java.util.Collections;
import play.mvc.*;
import models.*;
import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    List<Produto> lista = new ArrayList<>();

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result listar(){
        return ok(views.html.listar.render(lista));
    }

    public Result inserir(){
        return ok(views.html.inserir.render());
    }

    public Result inserirProduto(){
        Map<String, String[]> r = request().body().asFormUrlEncoded();
        String nome = r.get("nome")[0];
        int quantidade = Integer.parseInt(r.get("quantidade")[0]);
        Produto produto = new Produto(nome, quantidade);
        lista.add(produto);
        return redirect("/");
    }

    public Result remover(int produto){
        lista.remove(produto);
        return redirect("/");
    }

     public Result incrementar(int produtoPos){
        Produto produtoObj =  lista.get(produtoPos);    
        produtoObj.setQuantidade(produtoObj.getQuantidade()+1);
        return redirect("/");
    }
    public Result decrementar(int produtoPos){
        Produto produtoObj =  lista.get(produtoPos);    
        produtoObj.setQuantidade(produtoObj.getQuantidade()-1);
        return redirect("/");
    }
}
