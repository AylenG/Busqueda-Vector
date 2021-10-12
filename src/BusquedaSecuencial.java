
/*
    Busqueda secuencial:
        Se recorre el arreglo posición por posición
        y comparamos si coincide con el dato a buscar
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Aylen
 */

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int vec[] = {4, 1 , 5, 2, 3};
        int dato, i = 0, indexDato = -1;
        boolean encontrado = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar:"));

        // Búsqueda secuencial
        while(i < vec.length && !encontrado) {
            if(vec[i] == dato) {
                encontrado = true;
                indexDato = i;
            }
            i++;
        }
        
        if(encontrado) {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en la posición: " + indexDato);
        } else {
            JOptionPane.showMessageDialog(null, "El dato no se encuentra en el vector");
        }
        
    }
}
