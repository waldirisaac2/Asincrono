/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seccion3dad;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class asincrona {
    public static void main(String[] args) {
      System.out.println("Asincrona");
      ExecutorService exec1 = Executors.newSingleThreadExecutor();
      exec1.submit( ()->{
          tarea1();
          exec1.shutdown();
      });   
      ExecutorService exec2 = Executors.newSingleThreadExecutor();
      exec2.submit( ()->{
          tarea2();
          exec2.shutdown();
      });   
      ExecutorService exec3 = Executors.newSingleThreadExecutor();
      exec3.submit( ()->{
          tarea3();
          exec3.shutdown();
      });  
    }
    public static void tarea1(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Tarea 1: "+i);
        }
    }
    public static void tarea2(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Tarea 2: "+i);
        }
    }
    public static void tarea3(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Tarea 3: "+i);
        }
    }
}
