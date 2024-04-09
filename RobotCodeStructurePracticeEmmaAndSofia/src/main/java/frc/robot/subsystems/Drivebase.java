// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.motorConstants;

public class Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Drivebase() {}

  //created a new motor by instantiation; class object name = new classConstructor(int deviceId, MotorType type) 
  public CANSparkMax m_motor = new CANSparkMax(motorConstants.kmotorID, MotorType.kBrushless);

  //make method to set speed (doesn't return anything); objectname.method(argument)
  public void setSpeed(double speed){
    m_motor.set(speed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
