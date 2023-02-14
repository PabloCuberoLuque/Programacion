package aeropuerto;

public class Test {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("Pablo", "Cubero Luque", "5131515j","ijrwgijgrij@gijijgr.com",285734);
        Pasajero p2 = new Pasajero("Alejandro", "Torres Rios", "5131515j","ijrwgijgrij@gijijgr.com",23848);
        Pasajero p3 = new Pasajero("Jose Luis", "Lopez Caro", "5131515j","ijrwgijgrij@gijijgr.com",325123);
        
        
        Pasajero[] pasajeros= new Pasajero[2];
        pasajeros[0]=p1;pasajeros[1]=p2;pasajeros[2]=p3;
        
        
        
        Piloto pi1= new Piloto("Josema", "Verdugo Mejias", "96481468h","gjrerijkigr@ijdhuf.com",Rango.TANGO,1333.33,true);
        Vuelo v1= new Vuelo("Sevilla","Kiev",pi1,pasajeros,3);
        System.out.println();
    }}
   
