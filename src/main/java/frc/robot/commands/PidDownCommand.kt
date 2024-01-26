package frc.robot.commands

import com.revrobotics.CANSparkBase
import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.PIDSubsystem
import kotlin.math.abs

class PidDownCommand: Command() {
    override fun initialize() {
        PIDSubsystem.leftMotor.set(-.5)
        //PIDSubsystem.leftMotor.pidController.setReference(0.0, CANSparkBase.ControlType.kVelocity)
    }

    override fun execute() {
    }

    override fun isFinished(): Boolean {
        return abs(PIDSubsystem.leftMotor.encoder.position - 0.0) <= 0.1
    }

    override fun end(Interrupted: Boolean) {
    }
}
