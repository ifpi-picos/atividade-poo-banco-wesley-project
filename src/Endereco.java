
public class Endereco {

    private String rua;
    private String bairro;
    private int nCasa;
    private String ref;
        
    public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
    public int getnCasa(){
        return nCasa;
    }
    public String getRef(){
        return ref;
    }
    
    public void setRua(String novaRua){
        rua = novaRua;
    }
    public void setBairro(String novoBairro){
        bairro = novoBairro;
    }
    public void setNCasa(int novoNCasa){
        nCasa = novoNCasa;
    }
    public void setRef(String novoRef){
        ref = novoRef;
    }
    
    public void setEndereco(String novaRua, String novoBairro, int novonCasa, String novaRef){
        rua = novaRua;
        bairro = novoBairro;
        nCasa = novonCasa;
        ref = novaRef;
    }
}