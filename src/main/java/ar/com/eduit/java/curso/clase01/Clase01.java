/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.java.curso.clase01;

/** psvm TAB arma el metodo main
 *Punto de entrada del proyecto.
 * -@param  args Argumentos que ingresan desde consola.
 * @author luchitos
 */
public class Clase01 {
        public static void main(String[] args) {
        /*
        Curso: Java Standard programming 8.x 40hs
        Dìas: Martes y Jueves
        Profesor: Carlos Rios carlos.rios@educacionit.com
        Software JDK 8.X    www.oracle.com
                Netbeans IDE 8.2    netbeans.org
                IDE - Integrated Development Enviroment
        
        JDK Alternativo: OpenJDK (Solo Linux)
        
        IDEs Alternativos: Eclipse, IntelliJ, JDeveloper
        
        Materiales: alumni.educacionit.com
        user: l.signorelli@accenture.com
        password: dni
        
        */
        
        /**
         * Java Doc
         * Debe colocarse antes de la declaracion de clase o metodo
         * Queda definido en la interface de la clase.
         */
        
        // sout TAB atajo de teclado System.out.println
        
            System.out.println("Hola Mundo!!!");
            
            //Tipos de datos primitivos de JAVA
            
            //Tipo entero
            
            //Tipo de datos boolean     1 byte
            boolean bo = true;
            System.out.println(bo);
            bo=false;
            System.out.println(bo);
            
            //Tipo de dato byte 1 byte signed
            byte by=100;
            System.out.println(by);
            
            /*
                |---- 0 ------!
               -127           128
            */
            
            // Tipo de datos short 2bytes
            short sh=500;
            System.out.println(sh);
            
            //Tipo de dato int 4 byte
            int in=2000;
            System.out.println(in);
            
            //Tipos de datos long 8 bytes
            long lo=500000000000000L;
            System.out.println(lo);
            
            //Tipos de punto flotante
                
                //Tipos float 32 bits
                float fl=5.45F;
                
                //Tipos double 64 bits
                double dl=5.45;
                
                String st = "Esto Es Una Cadena De Caracteres";
                //Imprimir un string como si fuera un vector
                for(int a=0;a<st.length();a++){
                    char car = st.charAt(a);
                    if(car >=97 && car <=122) car -=32;
                    System.out.println(car);
                }
                //Imprimir un string como si fuera un vector
                for(int a=0;a<st.length();a++){
                    char car = st.charAt(a);
                    System.out.println((car >=97 && car<=122)?car-=32:car);//If and else
                }
                //imprimir el string en minusculas
                for(int a=0;a<st.length();a++){
                    char car = st.charAt(a);
                    System.out.print((car >=65 && car<=90)?car+=32:car);//If and else
                }
                
    }// Close main        
        public static void funcion2(String texto, int index) {
            if(texto == null || index >=texto.length())
                System.out.println(texto.charAt(index));        
    }
}//Close Clase01
