package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeleOp1Cont", group = "")
public class TeleOp1Cont extends LinearOpMode {

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
        float speed= 0.0f;
        double turnspeed = 0.0f;

        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");

        arm = hardwareMap.dcMotor.get("arm");

        Claw = hardwareMap.servo.get("Claw");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {

                speed = gamepad1.left_stick_y;
                leftFront.setPower(speed);
                leftBack.setPower(speed);
                rightFront.setPower(-speed);
                rightBack.setPower(-speed);

                turnspeed = gamepad1.left_stick_x;
                leftFront.setPower(-turnspeed);
                leftBack.setPower(-turnspeed);
                rightFront.setPower(-turnspeed);
                rightBack.setPower(-turnspeed);


                while (gamepad1.dpad_up) {
                    arm.setPower(0.75);

                }


                while (gamepad1.dpad_down) {
                    arm.setPower(-0.75);

                }



                while (gamepad1.a) {
                    leftFront.setPower(0.5);
                    sleep(1000);
                    leftFront.setPower(0);
                }

                while (gamepad1.b) {
                    arm.setPower(0);
                }

                while (gamepad1.right_bumper) {
                    Claw.setPosition(-30);
                }



                while (gamepad1.left_bumper) {
                    Claw.setPosition(60);
                }

                telemetry.update();
            }
        }
    }
}