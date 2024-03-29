package frc.robot.subsystems

import com.revrobotics.CANSparkLowLevel
import com.revrobotics.CANSparkMax
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab
import edu.wpi.first.wpilibj2.command.SubsystemBase

object PIDSubsystem : SubsystemBase() {
    val leftMotor = CANSparkMax(1, CANSparkLowLevel.MotorType.kBrushless)
    val rightMotor = CANSparkMax (5, CANSparkLowLevel.MotorType.kBrushless)
    val kP = 0.010
    val kI = 0.008
    val kD = 0.002

    init{
        leftMotor.encoder.setPositionConversionFactor(16.0/1.0)
        rightMotor.encoder.setPositionConversionFactor(16.0/1.0)
        val driveTab: ShuffleboardTab = Shuffleboard.getTab("Drive Subsystem")
        driveTab.addNumber("Left Motor Velocity",) {return@addNumber leftMotor.encoder.velocity }
        driveTab.addNumber("Right Motor Velocity",) {return@addNumber rightMotor.encoder.velocity}

        val pid = leftMotor.pidController

        pid.p = kP
        pid.i = kI
        pid.d = kD

        val pidd = rightMotor.pidController

        pidd.p = kP
        pidd.i = kI
        pidd.d = kD
    }

    override fun periodic() {
    }

    override fun simulationPeriodic() {
    }
    }
