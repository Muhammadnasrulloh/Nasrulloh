class hewan {
public void suara (){
System.out.println("Hewan bersuara :");
}
}
public class anjing extends hewan {
public void suara(){
System.out.println("anjing menggonggong...");
}
}
public class burung extends hewan {
public void suara (){
System.out.println("burung berkicau...");
}
}
public class ayam extends hewan {
public void suara(){
System.out.println("Ayam berkokok...");
}
}
public class suarahewan {
public static void main(String[] args){
hewan HEWAN = new hewan();
anjing ANJING = new anjing();
burung BURUNG = new burung();
ayam AYAM = new ayam();

HEWAN.suara();

HEWAN = ANJING;
HEWAN.suara();

HEWAN = BURUNG;
HEWAN.suara();

HEWAN = AYAM;
HEWAN.suara();
}
}