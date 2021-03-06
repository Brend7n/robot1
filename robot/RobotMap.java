package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Drivetrain speed controllers
    public static final int frontRight = 2;
    public static final int backRight = 3;
    public static final int frontLeft = 0;
    public static final int backLeft = 1;
  
    // PCM Channels
    public static final int doubleSolenoid1 = 0;
    public static final int doubleSolenoid2 = 1;
    // Digital Input Ports

       // Drivetrain Encoder Ports
  
      public static final int leftEnc1 = 0;
      public static final int leftEnc2 = 1;
      public static final int rightEnc1 = 2;
      public static final int rightEnc2 = 3;
   
      // Intake Ultrasonic Ports
  
      public static final int ping = 4;
      public static final int echo = 5;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
