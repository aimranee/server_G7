/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import dao.IDaoMachine;
import dao.IDaoSalle;
import entities.*;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author Lachgar
 */
public class Serveur {

    public static void main(String[] args) {
        try {
            int port = 1098;
            IDaoMachine daoMachine = new MachineService();
            IDaoSalle daoSalle = new SalleService();
            
            LocateRegistry.createRegistry(port);
            
            Naming.bind("rmi://localhost:"+port+"/daoMachine", daoMachine);
            Naming.bind("rmi://localhost:"+port+"/daoSalle", daoSalle);
            
            System.out.println("En attente des clients sur le port "+port);
            
        } catch (RemoteException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
