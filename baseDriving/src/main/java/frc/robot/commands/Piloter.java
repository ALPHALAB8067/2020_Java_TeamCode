/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BasePilotable;

public class Piloter extends CommandBase {
    
    //Étape 6 -- Création des variables contenant les objets du sous-système "BasePilotable"
    //et du Joystick
    private BasePilotable basePilotable; 
    private Joystick stick;

 //Étape 7 -  Déclaration des sous-systèmes et stockage des attributs dans le Constructeur: 
 public Piloter(BasePilotable _basePilotable, Joystick _stick) {
    basePilotable = _basePilotable; 
    stick = _stick;
    addRequirements(basePilotable);

    }
    

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }


// Étape 8 - Appel de la méthode avec les attributs du joystick
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    basePilotable.drive(-1 * stick.getY(), stick.getX());
  }

  //Étape 9 - arrêt de la commande par interruption du programme 
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    basePilotable.stop();

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
