/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.commands.Ramp;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author RoboLancers
 */
public class RampDown extends CommandBase{

    
    public RampDown(){
        requires(ramp);
    }
    
    protected void initialize(){}

    protected void execute() {
        ramp.rampMotor.set(-0.12);
    }

    protected boolean isFinished(){
        return ramp.potentiometer.get() <= 0.0;
    }

    protected void end() {
        ramp.rampMotor.set(0.0);
    }

    protected void interrupted() {}
    
}
