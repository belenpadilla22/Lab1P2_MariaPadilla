
package lab1p2_mariapadilla;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab1P2_MariaPadilla {
    static Scanner leer=new Scanner(System.in);
    static ArrayList < Registro> listas =new ArrayList <>();
    static ArrayList<String>correo2=new ArrayList<>();
    static ArrayList<String>contra2=new ArrayList<>();

   
    public static void main(String[] args) throws ParseException {
        System.out.println(" REGISTRO DE USUARIO ");
        System.out.println(" 1. Registrar Usuario ");
        System.out.println(" 2. Listar todo ");
        System.out.println(" 3. Listar por dominio ");
        System.out.println(" 4. Salir ");
        System.out.println(" Ingrese una opcion: ");
        int opcion=leer.nextInt();
        while (opcion>0 && opcion<4){
            switch (opcion){
                case 1: 
                    agregar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    dominio(listas);
                    break;
            }
        
        System.out.println(" REGISTRO DE USUARIO ");
        System.out.println(" 1. Registrar Usuario ");
        System.out.println(" 2. Listar todo ");
        System.out.println(" 3. Listar por dominio ");
        System.out.println(" 4. Salir");
        System.out.println(" Ingrese una opcion: ");
        opcion=leer.nextInt();
        }
        
    }
    public static void agregar () throws ParseException{
       
              System.out.println(" Ingrese su nombre: ");
              String nombre=leer.next();
              System.out.println(" Ingrese su apellido: ");
              String apellido=leer.next();
              System.out.println(" Ingrese su fecha de nacimiento: ");
              String fecha=leer.next();
              SimpleDateFormat date=new SimpleDateFormat("dd/MM/yy");
              Date nacimiento=date.parse(fecha);
              String correo= "";
              while (!correom(correo)){
                  System.out.println(" Ingrese su correo electronico ");
                  correo=leer.next();
              
              }
              String contra="";
              while (!contram(contra)){
                  System.out.println(" Ingrese su contraseña:");   
                  contra=leer.next();
              }
              
              Registro c=new Registro(nombre,apellido,fecha,correo,contra);
              listas.add(c);
              while (edadVerifiacar(nacimiento)==true){
              System.out.println(" Ingrese su nombre: ");
              nombre=leer.next();
              System.out.println(" Ingrese su apellido: ");
              apellido=leer.next();
              System.out.println(" Ingrese su fecha de nacimiento: ");
              fecha=leer.next();
              //SimpleDateFormat date=new SimpleDateFormat("dd/MM/yy");
              nacimiento=date.parse(fecha);
              correo= "";
              while (!correom(correo)){
                  System.out.println(" Ingrese su correo electronico ");
                  correo=leer.next();
              
              }
              contra="";
              while (!contram(contra)){
                  System.out.println(" Ingrese su contraseña:");   
                  contra=leer.next();
              }
              
              c=new Registro(nombre,apellido,fecha,correo,contra);
              listas.add(c);   
              
              }
             
             
              
    }
    public static void listar (){
        for (int i = 0; i <listas.size(); i++) {
            System.out.println(listas.get(i).toString()); 
        }
    
    }
    public static boolean edadVerifiacar (Date nacimiento){
        Date actual;
        actual =new Date();
        boolean correcta=false;
        if (actual.getYear()-nacimiento.getYear()<13){
            System.out.println(" Tiene que ser mayor de 13 años ");
            correcta=true;
           
        }
         return correcta;
                 
    }
    public static boolean correom (String correo){
        
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";Pattern pattern = Pattern.compile(regex);//comparar
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();//
    }
    public static boolean contram (String contra){
        String regex = "^[a-zA-Z0-9._%&$+-?<>!]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contra);
        return matcher.matches();
        
    }

    public static void dominio (ArrayList<Registro>listas){
      
        for (Registro lista : listas) {
            String token[]=lista.getCorreo().split("@");
             Date actual;
            actual =new Date();
            if (token[1].equalsIgnoreCase("Gmail.com")){
                System.out.println(" Gmail ");
                lista.toString();
                System.out.println(lista.toString());
               // System.out.println(" Año :"+ actual.getYear()-lista.getFecha());
                
            }else if(token[1].equalsIgnoreCase("Outlook.com")){
                System.out.println(" Outlook ");
                lista.toString();
                System.out.println(lista.toString());
          
            }else if(token[1].equalsIgnoreCase("Yahoo.com")){
                System.out.println(" Yahoo ");
                //lista.toString();
                System.out.println(lista.toString());
                
          
            }else if(token[1].equalsIgnoreCase("iCloud.com")){
                System.out.println(" iCloud ");
                lista.toString();
                System.out.println(lista.toString());
                
          
            }else if(token[1].equalsIgnoreCase("ProtonMail.com")){
                System.out.println(" ProtonMail ");
                lista.toString();
               //listar();
               System.out.println(lista.toString());
          
            }else if(token[1].equalsIgnoreCase("FastMail.com")){
                System.out.println(" FastaMail");
                lista.toString();
                //listar();
                System.out.println(lista.toString());
          
            }
        }
    
    
    }
   
}

