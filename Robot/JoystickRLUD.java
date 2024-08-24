package org.firstinspires.ftc.teamcode.bakar;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
//import com.qualcomm.hardware.bosch.BNO055IMU;

@TeleOp

public class MasoudaJoystick extends LinearOpMode {
    DcMotor backLeft;
    DcMotor backRight;
    DcMotor frontLeft;
    DcMotor frontRight;
@Override
    public void runOpMode() {
     
     
      backLeft = hardwareMap.get(DcMotor.class, "bl");
      backRight = hardwareMap.get(DcMotor.class, "br");
      frontLeft = hardwareMap.get(DcMotor.class, "fl");
      frontRight = hardwareMap.get(DcMotor.class, "fr");

 
      waitForStart();

    while (opModeIsActive()) {

      float x = this.gamepad1.left_stick_x; //'this' refers to the gamepad1
      float y = this.gamepad1.left_stick_y * -1;
      float h = this.gamepad1.right_stick_x;

      telemetry.addData("Status", "x:" + x + "y:" + y + "h:" + h);
      telemetry.update();  
   

     frontLeft.setPower(x-y);
     frontRight.setPower(x+y);
     
     backLeft.setPower(-x-y);
     backRight.setPower(-x+y);
     }
     
 
     
     
     
    }
  }
