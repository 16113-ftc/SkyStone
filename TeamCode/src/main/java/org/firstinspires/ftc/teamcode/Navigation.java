package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Navigation", group = "")
public class Navigation extends LinearOpMode {

    private DcMotor left;
    private DcMotor right;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        float speed;
        double turnspeed;

        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                while (!gamepad1.b) {
                    speed = gamepad1.left_stick_y;
                    left.setPower(speed);
                    right.setPower(-speed);
                    turnspeed = -gamepad1.left_stick_x;
                    left.setPower(turnspeed / 1.5);
                    right.setPower(turnspeed / 1.5);
                }
                telemetry.update();
            }
        }
    }
}
