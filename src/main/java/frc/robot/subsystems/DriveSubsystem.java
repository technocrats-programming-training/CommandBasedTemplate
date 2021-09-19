// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  Spark leftMotor;
  Spark rightMotor;

  /** Creates a new ExampleSubsystem. */
  public DriveSubsystem() {
    leftMotor = new Spark(0);
    rightMotor = new Spark(1);
  }

  public void Drive(double leftSpeed, double rightSpeed) {
    leftMotor.set(leftSpeed);
    rightMotor.set(rightSpeed * -1);
  }

}