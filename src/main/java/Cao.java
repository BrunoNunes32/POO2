public class Cao {
  private int idade;

  public void setIdade(int i){
    idade = i;
  }

  public int getIdade(){
    return idade;
  }

  public boolean VerificarIdade(){
    if(idade > 10){
      return true;
    }else{
      return false;
    }
  }

  public void Latir(){
    System.out.println("Au au au");
  }
  public void Correr(){
    System.out.println("Correndo...");
  }
  public void Andar(){
    System.out.println("Andando...");
  }
  public void Dormir(){
    System.out.println("Dormindo...");
  }
  
  
}