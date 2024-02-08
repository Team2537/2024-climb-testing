package frc.robot.commands

import com.revrobotics.CANSparkBase
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.RobotContainer
import frc.robot.subsystems.PIDSubsystem
import kotlin.math.abs

class PidDownCommand: Command() {
    override fun initialize() {
        //PIDSubsystem.leftMotor.pidController.setReference(0.0, CANSparkBase.ControlType.kVelocity)
        //PIDSubsystem.rightMotor.pidController.setReference(0.0, CANSparkBase.ControlType.kVelocity)
    }

    override fun execute() {
        PIDSubsystem.leftMotor.set((RobotContainer.joystickController.getRawAxis(3) - 1)/2)
        PIDSubsystem.rightMotor.set((RobotContainer.joystickController.getRawAxis(3)-1)/2)
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(Interrupted: Boolean) {
        PIDSubsystem.leftMotor.set(0.0);
        PIDSubsystem.rightMotor.set(0.0);
    }
}
