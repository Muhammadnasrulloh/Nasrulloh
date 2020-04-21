class User {
 
    String nama = "Moch.Nasrulloh";
 
    public static void main(String[] args) {
        User nasrul = new User();
        System.out.println(nasrul.nama);
        nasrul.setNama("Nasrul");
        String namaBaru = nasrul.getNama();
        System.out.println(namaBaru);
    }
   
    // setter = void
    void setNama(String parameterNama) {
        nama = parameterNama;
    }
 
    // getter = return
    String getNama() {
        return nama;
    }
}