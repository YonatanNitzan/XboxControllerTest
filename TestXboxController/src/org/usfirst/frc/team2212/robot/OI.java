package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.commands.PrintCommand;

import edu.wpi.first.wpilibj.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	XboxController xbox = new XboxController(0);

	public void startPressed() {
		new PrintCommand();
	}
}
