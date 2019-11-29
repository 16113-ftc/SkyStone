package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "NothingAutoLeft", group = "")
public class NothingAutoLeft extends LinearOpMode {

    private DcMotor leftFront;
    private DcMotor rightFront;
    private DcMotor leftBack;
    private DcMotor rightBack;

    private DcMotor arm;

    private Servo Claw;
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

        arm = hardwareMap.dcMotor.get("arm");

        Claw = hardwareMap.servo.get("Claw");

        sleep(5000);

        leftFront.setPower(0.75);
        leftBack.setPower(-0.75);
        rightFront.setPower(0.75);
        rightBack.setPower(-0.75);

        sleep(500);

        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);

        leftFront.setPower(-0.75);
        leftBack.setPower(-0.75);
        rightFront.setPower(0.75);
        rightBack.setPower(0.75);

        sleep(1000);

        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);


    }

}


