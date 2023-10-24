/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author Lachgar
 */
public class Test {

    public static void main(String[] args) {
        try {

            SalleService ss = new SalleService();
            
            //System.out.println(" ==> "+ss.findByCode("A1"));
            /*ss.create(new Salle("A1"));
            ss.create(new Salle("A2"));
            ss.create(new Salle("A3"));
            for (Salle s : ss.findAll()) {
                System.out.println(s);
            }*/
            //System.out.println("test : "+ss.findByCode("A1"));
            MachineService ms = new MachineService();
            /*ms.create(new Machine("RE44", "HP", 2000, ss.findById(1)));
             ms.create(new Machine("RE54", "DELL", 5000, ss.findById(2)));
             ms.create(new Machine("AA74", "LENOV", 6000, ss.findById(3)));
             ms.create(new Machine("GT75", "HP", 2500, ss.findById(1)));
             ms.create(new Machine("JY83", "DELL", 7000, ss.findById(2)));
             ms.create(new Machine("ER14", "LENOV", 6300, ss.findById(3)));
             for (Machine m : ms.findAll()) {
             System.out.println(m);
             }*/

            /*for(Machine m : ms.findAllMachinesBySalle(1))
             System.out.println(m);*/
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
