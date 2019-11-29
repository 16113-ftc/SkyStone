package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "abcdefg", group = "")
public class abcdefg extends LinearOpMode {

    private DcMotor leftFront;
    private DcMotor rightFront;
    private DcMotor leftBack;
    private DcMotor rightBack;
    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        waitForStart();
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");
        telemetry.addData("a", "b");
        telemetry.update();
        sleep(5000);

        leftFront.setPower(-0.75);
        leftBack.setPower(-0.75);
        rightFront.setPower(0.75);
        rightBack.setPower(0.75);
        telemetry.addData("e", "f");
        telemetry.update();
        sleep(1000);

        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);
        sleep(3000);
        leftFront.setPower(0.75);
        leftBack.setPower(0.75);
        rightFront.setPower(-0.75);
        rightBack.setPower(-0.75);
        telemetry.addData("e", "f");
        telemetry.update();
        sleep(500);

        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);

        //leftFront.setPower(-0.75);
        //leftBack.setPower(-0.75);
        //rightBack.setPower(0.75);
        //rightFront.setPower(0.75);
        //telemetry.addData("c", "d");
        //telemetry.update();
        //sleep(2000);

        //leftFront.setPower(0);
        //leftBack.setPower(0);
       // rightFront.setPower(0);
        //rightBack.setPower(0);

       leftFront.setPower(0.75);
        leftBack.setPower(0.75);
        rightFront.setPower(0.75);
       rightBack.setPower(0.75);
       telemetry.addData("e", "f");
       telemetry.update();
        sleep(1200);

        leftFront.setPower(0);
       leftBack.setPower(0);
       rightFront.setPower(0);
       rightBack.setPower(0);

       //leftFront.setPower(0.75);
        //leftBack.setPower(0.75);
       // rightFront.setPower(0.75);
       // rightBack.setPower(0.75);
       // telemetry.addData("g", "h");
        //telemetry.update();
        //sleep(500);

        //leftFront.setPower(0);
        //leftBack.setPower(0);
        //rightFront.setPower(0);
        //rightBack.setPower(0);
    }

}
