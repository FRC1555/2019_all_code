/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1555.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static int Lmotor = 0;
	public static int Rmotor = 1;
	//Due to a shortage in signal wire splitters, we are currently running the right drive motors off two separate ports
	public static int Rmotor2 = 2;
	
	public static int intake = 3;
	public static int intakeLift = 4;
	//The hatch panel grabbers are currently run off two ports, although we should be able to change it to one in the future
	public static int hatchSlapper1 = 5;
	public static int hatchSlapper2 = 6;
	
	public static int solenoidP1 = 0;
	public static int solenoidP2 = 1;
	
	public static int Lencoder = 0;
	public static int Rencoder = 1;

	public static int sensorA = 2;
	public static int sensorB = 3;
	public static int sensorC = 4;
	public static int sensorD = 5;
	
	public static String limeLightKey = "limelight";
	
	
	
}
