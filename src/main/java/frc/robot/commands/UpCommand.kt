package frc.robot.commands

import com.revrobotics.CANSparkBase
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.PIDSubsystem
import kotlin.math.abs

class UpCommand : Command() {
    override fun initialize() {
        PIDSubsystem.leftMotor.set(.3)
        //PIDSubsystem.leftMotor.pidController.setReference(1.0, CANSparkBase.ControlType.kVelocity)
    }

    override fun execute() {
    }

    override fun isFinished(): Boolean {
        //return abs(PIDSubsystem.leftMotor.encoder.position - 1.0) <= 0.1
        return false
    }

    override fun end(Interrupted: Boolean) {
        PIDSubsystem.leftMotor.set(0.0);
    }
}
