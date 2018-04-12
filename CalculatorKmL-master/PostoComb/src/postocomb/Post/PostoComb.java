
package postocomb;

public class PostoComb {
    
    private float km;
    private float litro;
    private float result;
    
    public PostoComb (){
        km = 0;
        litro = 0;
        result = 0;
    }
public void calcular(float km, float litro, float result){
        result = km * litro;   
    }
    public float getKm(){
        return km;
    }
    public float getLitro(){
        return litro;
    }
    public float getResult(){
        return result;
    }
     public void setKm(float a){
        km = a;
    }
    public void setLitro(float l){
        litro = l;
    }
    public void setResult(float r){
        result = r;
    }
    
}

  


    
