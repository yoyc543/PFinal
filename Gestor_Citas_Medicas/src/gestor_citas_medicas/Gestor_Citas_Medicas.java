/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestor_citas_medicas;

/**
 *
 * @author christian
 */
public class Gestor_Citas_Medicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello word");
    Especialidad especialidad1 = new Especialidad(1,"Cardiologia");
    Medico medico1= new Medico(1,especialidad1, "cedula1", "Luis", 
            "Rojas", 54697812, "Masculino", 978375159, "S/N");
//      paciente1.ingresarIDPaciente(111);
//      paciente1.ingresarDNI(12659854);
//      paciente1.ingresarPaciente("Juan");
//      paciente1.ingresarApellido("Ortiz");
//      paciente1.ingresarSexo("Masculino");
//      paciente1.ingresarCelular(789546132);
//      paciente1.ingresarDireccion("dkhjlashdkabcxzn");
//      paciente1.mostrarIDPaciente();
//      paciente1.mostrarDNI();
//      paciente1.mostrarPaciente();
//      paciente1.mostrarApellido();
//      paciente1.mostrarSexo();
//      paciente1.mostrarCelular();
//      paciente1.mostrarDireccion();
//      
//        System.out.println(paciente1.mostrarIDPaciente());
//        System.out.println( paciente1.mostrarDNI());
//        System.out.println(paciente1.mostrarPaciente());
//        System.out.println(paciente1.mostrarApellido());
//        System.out.println(paciente1.mostrarSexo());
//        System.out.println(paciente1.mostrarCelular());
//        System.out.println(paciente1.mostrarDireccion());



//System.out.println(paciente1.mostrarDireccion());

//System.out.println(paciente1.mostrarDireccion());

//System.out.println(paciente1.mostrarDireccion());
        
        
        System.out.println( medico1.toString());
    }
    
    
}
