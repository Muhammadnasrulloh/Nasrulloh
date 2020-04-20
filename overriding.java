class Nama{
 public void Saya(){
  System.out.println("Nasrulloh");
 }
 public static void main(String [] args){
  Siapa ss;
  Nama nn;
  ss = new Siapa();
  nn = new Nama();
  
  ss.Saya();//memanggil method Saya() pada class Siapa
  nn.Saya();//memanggil method Saya() pada class Nama
 }
}
class Siapa extends Nama{
 //Method Sapa() pada class Nama di override
 public void Saya(){
  System.out.println("Muhammad");
 }
}

 