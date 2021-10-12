
/*
    Busqueda binaria
        - Se requiere tener el vector ordenado
        Funciona al dividir repetidamente a la mitad la porción de la 
        lista que podría contener al elemento, hasta reducir las ubicaciones 
        posibles a solo una.
*/

import javax.swing.JOptionPane;

/**
 *
 * @author Aylen
 */

public class BusquedaBinaria {
    public static void main(String[] args) {
        int vec[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int dato, indexDato, inf, sup, mitad, i;
        boolean encontrado = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar:"));
        indexDato = 0;
        
        // Búsqueda binaria
        inf = 0;
        sup = vec.length;
        i = 0;
        
        mitad = (inf + sup) / 2;
        while(inf <= sup && i < vec.length) {
            if(vec[mitad] == dato) {
                encontrado = true;
                indexDato = mitad;
                break;
            } else if(vec[mitad] > dato) {
                sup = mitad;
            } else {
                inf = mitad;
            }
            mitad = (inf + sup) / 2;
            i++;
        }
        
        if(encontrado) {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en la posición: " + indexDato);
        } else {
            JOptionPane.showMessageDialog(null, "El dato no se encuentra en el vector");
        }
    }
}
