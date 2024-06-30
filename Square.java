
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


@Autonomous

public class MasoudaNewS extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;

    public void runOpMode() {
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      backLeft = hardwareMap.get(DcMotor.class, "backLeft");
      backRight = hardwareMap.get(DcMotor.class, "backRight");

         int count = 1;
      while (count < 2){
         frontLeft.setPower(-0.5);
         frontRight.setPower(0.5);
         backLeft.setPower(-0.5);
         backRight.setPower(0.5);
          sleep(1500);
         frontLeft.setPower(0);
         frontRight.setPower(0);
         backLeft.setPower(0);
         backRight.setPower(0);
          sleep(500);
         frontLeft.setPower(-0.6);
         frontRight.setPower(-0.6);
         backLeft.setPower(0.6);
         backRight.setPower(0.6);
          sleep(1600);
         frontLeft.setPower(0);
         frontRight.setPower(0);
         backLeft.setPower(0);
         backRight.setPower(0);
          sleep(500);
         frontLeft.setPower (0.5);
         frontRight.setPower(-0.5);
         backLeft.setPower (0.5);
         backRight.setPower(-0.5);
          sleep(1500);
         frontLeft.setPower(0);
         frontRight.setPower(0);
         backLeft.setPower(0);
         backRight.setPower(0);
          sleep(500);
         frontLeft.setPower(0.6);
         frontRight.setPower(0.6);
         backLeft.setPower(-0.6);
         backRight.setPower(-0.6);
          sleep(1600);
           count++;
      }
    }
}
