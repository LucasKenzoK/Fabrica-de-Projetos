package model;
public class Produto {

//Atributos    
    
private String Produto ;

private String Categoria;

private String Estado;

private String Descricao;

private double Valor;


//GET AND SET

public String getProduto (){

return Produto;    
}
public void setProduto (String Produto){

this.Produto = Produto;
}
public String getCategoria (){

return Categoria;    
}
public void setCategoria (String Categoria){

this.Categoria = Categoria;
}
public String getEstado (){
 
 return Estado;
}
public void setEstado (String Estado){

this.Estado = Estado;    
}

public String getDescricao (){
 
 return Descricao;
}
public void setDescricao (String Descricao){

this.Descricao = Descricao;    
}

public double getValor (){
 
 return Valor;
}
public void setValor (double Valor){

this.Valor = Valor;    
}



public void limpaCadastro (){
    
Produto = "";

Categoria = "";

Estado = "";

Descricao = "";

Valor = 0;
}

}
