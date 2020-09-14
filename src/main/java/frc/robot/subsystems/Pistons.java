/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.Constants.PistonsConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Pistons extends SubsystemBase {
  /**
   * Creates a new Pistons.
   */
  private final DoubleSolenoid upperPiston =  new DoubleSolenoid(PistonsConstants.kUpperPistonExtendChannel, PistonsConstants.kUpperPistonRetractChannel);
  private final DoubleSolenoid lowerPiston =  new DoubleSolenoid(PistonsConstants.kLowerPistonExtendChannel, PistonsConstants.kLowerPistonRetractChannel);

  public Pistons() {
    retractUpper();
    retractLower();


  }

  public void extendUpper() {
    upperPiston.set(DoubleSolenoid.Value.kForward);
  }

  public void retractUpper() {
    upperPiston.set(DoubleSolenoid.Value.kReverse);
  }

  public void extendLower() {
    lowerPiston.set(DoubleSolenoid.Value.kForward);
  }

  public void retractLower() {
    lowerPiston.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
