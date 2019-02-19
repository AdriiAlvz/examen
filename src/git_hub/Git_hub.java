/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_hub;

/**
 *
 * @author Alumno
 */
public class persona {

String numero de telefono;
public Persona(String numeroDeTelefono) {
    
super();
this.numeroDeTelefono= numeroDeTelefono;

}
public String getNumeroDeTelefono(){
    return numeroDeTelefono;
}
public void setNumeroDeTelefono(String numeroDeTelefono) {
    this.numeroDeTelefono= numeroDeTelefono;
}
}
    public class Profesor extends Persona {
        String srt;
        int edad;
        String numeroDeTelefono;
        List<prestamo> prestamos;
        
        public Profesor (String numeroDeTelefono) {
            super (numeroDeTelefono);
        }
        public void printInformacionPersonal() {
            System.out.println("nombre: " +srt);
            System.out.println("edad: " +edad);
            System.out.println("telefono: " +this.numeroDeTelefono);
        }
        
        public void printTodaLaInformacion() {
            System.out.println("nombre: " +srt);
            System.out.println("edad: "+ edad);
            System.out.println("telefono: " +this.numeroDeTelefono);
            for(Prestamo p: prestamos) {
                System.out.println(p);
            }
        }
    
}
