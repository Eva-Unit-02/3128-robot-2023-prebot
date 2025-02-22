package frc.team3128.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.ScheduleCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.team3128.RobotContainer;
import frc.team3128.Constants.IntakeConstants;
import frc.team3128.Constants.ManipulatorConstants;
import frc.team3128.Constants.ArmConstants.ArmPosition;
import frc.team3128.common.constantsint.ConstantsInt.VisionConstants;
import frc.team3128.common.hardware.input.NAR_XboxController;
import frc.team3128.common.narwhaldashboard.NarwhalDashboard;
import frc.team3128.subsystems.Led;
import frc.team3128.subsystems.Vision;

public class CmdManager {
    private static Led led = Led.getInstance();
    private static NAR_XboxController controller = RobotContainer.controller;


    private CmdManager() {}

    public static CommandBase vibrateController() {
        return new ScheduleCommand(new WaitCommand(0.5).deadlineWith(new StartEndCommand(() -> RobotContainer.controller.startVibrate(), () -> RobotContainer.controller.stopVibrate())));
    }
}
