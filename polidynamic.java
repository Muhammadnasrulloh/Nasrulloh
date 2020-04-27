public class A extends Object {
@Override
public String toString(){
return "method toString() dari class A dipanggil!";
}
}
public class B extends A {
@Override
public String toString(){
return "method toString() dari class B dipanggil!";
}
}
public class C extends B {
@Override
public String toString(){
return "method toString() dari class C dipanggil!";
}
}
public class D extends C {
//tidak mengoverride method toString()
}
public class E extends D{
//tidak mengoverride method toString()
}
public class TestDynamicBinding {
//Method perintah dengan parameter tipe Object
static void perintah(Object myObject){
System.out.println(myObject.toString());
}
public static void main(String[] args) {
perintah(new E());//memanggil method toString dari class C
perintah(new D());//memanggil method toString dari class C
perintah(new C());//memanggil method toString dari class C
perintah(new B());//memanggil method toString dari class B
perintah(new A());//memanggil method toString dari class A
perintah(new Object());
}
}