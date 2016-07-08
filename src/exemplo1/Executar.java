package exemplo1;

import java.util.Scanner;

public class Executar {

    public static void main(String[]args){
    
    Marca marca = new Marca(1,"Honda");
    Modelo modelo = new Modelo(1,"Civic",marca);
    Carro carro = new Carro(1, modelo, "XYS-2040", 2010,22000);
    
    System.out.println(carro);    
        
        
//        Scanner sc = new Scanner(System.in);
//        Carro carro = new Carro();
//    
//        System.out.print("Ano do Carro: ");
//        int ano = sc.nextInt();
//        
//        System.out.print("Quilometragem: ");
//        int km = sc.nextInt();
//        
//        System.out.print("Placa: ");
//        String placa = sc.next();
//        
//        Modelo modelo = new Modelo();
//        Marca marca = new Marca();
//        
//        System.out.print("Marca: ");
//        marca.nome = sc.next();
//        modelo.marca = marca;
//                
//        System.out.print("Modelo: ");
//        modelo.nome = sc.next();
//        
//        Carro carro = new Carro(1, modelo, placa, ano, km);
//        
//        //System.out.println(carro);
//        System.out.println(carro.toString());
//    
    
    
    }
    
}
