/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesContadores;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

/**
 *
 * @author brylo
 */
public class AgenteCont extends Agent {
   Comportamiento comp= new Comportamiento();
    protected void setup()
    {
        this.addBehaviour(comp);
    }
    
}

class Comportamiento extends Behaviour
{
    int cont=1;
    public void action()
    {
        System.out.println(cont);
        cont ++;
    }

    public boolean done()
    {
        return cont>100;
    }
}

