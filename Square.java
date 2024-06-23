
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous

public class MasoudaSquare extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;



    public void runOpMode() {
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      backLeft = hardwareMap.get(DcMotor.class, "backLeft");
      backRight = hardwareMap.get(DcMotor.class, "backRight");
    waitForStart();
      int count = 0;
      while (count < 4){
         frontLeft.setPower(-0.7);
         frontRight.setPower(0.7);
         backLeft.setPower(-0.7);
         backRight.setPower(0.7);
          sleep(200);
          
         frontLeft.setPower(0);
         frontRight.setPower(0);
         backLeft.setPower(0);
         backRight.setPower(0);
         sleep(100);
         
         frontLeft.setPower(-0.7);
         frontRight.setPower(-0.7);
         backLeft.setPower(-0.7);
         backRight.setPower(-0.7);
          sleep(200);
         
         count = (count++);
      }

    }
    
}
