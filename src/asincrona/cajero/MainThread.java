/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asincrona.cajero;

import asincrona.cajero.Cliente;
import asincrona.cajero.CajeraThread;

public class MainThread {
     public static void main(String[] args) {

            Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
            Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
            Cliente cliente3 = new Cliente("Cliente 3", new int[] { 2, 1, 7, 5, 8, 1 });
            Cliente cliente4 = new Cliente("Cliente 4", new int[] { 1, 31, 52, 10, 60 });
            Cliente cliente5 = new Cliente("Cliente 5", new int[] { 12, 21, 31, 25, 12, 23 });
            Cliente cliente6 = new Cliente("Cliente 6", new int[] { 1, 3, 5, 1, 1 });
            // Tiempo inicial de referencia
            long initialTime = System.currentTimeMillis();
            CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
            CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);
            CajeraThread cajera3 = new CajeraThread("Cajera 3", cliente3, initialTime);
            CajeraThread cajera4 = new CajeraThread("Cajera 4", cliente4, initialTime);
            CajeraThread cajera5 = new CajeraThread("Cajera 5", cliente5, initialTime);
            CajeraThread cajera6 = new CajeraThread("Cajera 6", cliente6, initialTime);

            cajera1.start();
            cajera2.start();
            
            cajera3.start();
            cajera4.start();
            
            cajera5.start();
            cajera6.start();
            
    }
}
