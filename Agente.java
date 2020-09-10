/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;


/**
 *
 * @author brylo
 */
public class Agente extends Agent {
    Comportamiento comp= new Comportamiento();
    protected void setup()
    {
        this.addBehaviour(comp);
    }
    
}

class Comportamiento extends Behaviour
{
    public void action()
    {
        System.out.println("HOLA MUNDO DE AGENTES ---" + myAgent.getAID()+myAgent.getName());
    }

    public boolean done()
    {
        return true;
    }
}
