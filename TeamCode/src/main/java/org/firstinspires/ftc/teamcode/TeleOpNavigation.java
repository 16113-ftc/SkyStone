package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TeleOpNavigation (Blocks to Java)", group = "")
public class TeleOpNavigation extends LinearOpMode {

    private DcMotor leftFront;
    private DcMotor rightFront;
    private DcMotor leftBack;
    private DcMotor rightBack;


    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        float speed= 0.0f;
        double turnspeed = 0.0f;

        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");
        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                while (!gamepad1.b) {
                    speed = gamepad1.left_stick_y;
                    leftFront.setPower(speed);
                    leftBack.setPower(speed);
                    rightFront.setPower(speed);
                    rightBack.setPower(speed);
                    turnspeed = -gamepad1.left_stick_x;
                    leftFront.setPower(turnspeed / 1.5);
                    leftBack.setPower(turnspeed / 1.5);
                    rightFront.setPower(-turnspeed / 1.5);
                    rightBack.setPower(-turnspeed / 1.5);
                }
                telemetry.update();
            }
        }
    }
}