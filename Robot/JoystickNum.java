package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp

public class MasoudaTeleop28 extends LinearOpMode{
    
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
        while (opModeIsActive ()) {
            float x = this.gamepad1.left_stick_x * -1 ;
            float y = this.gamepad1.left_stick_y * -1 ;
            
                telemetry.addData("Status", "x:" + x + "y:" + y);
                telemetry.update();
        }
    }
}
