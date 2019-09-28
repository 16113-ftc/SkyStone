package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "NavigationAuto", group = "")
public class NavigationAuto extends LinearOpMode {

    private DcMotor left_drive;
    private DcMotor right_drive;

    /**
     * This function is executed when this Op Mode is selected from the Driver Statio.
     */
    @Override
    public void runOpMode() {
        left_drive = hardwareMap.dcMotor.get("left_drive");
        right_drive = hardwareMap.dcMotor.get("right_drive");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            left_drive.setPower(1);
            right_drive.setPower(-1);
            sleep(1000);
            left_drive.setPower(-1);
            right_drive.setPower(1);
            sleep(1000);
            left_drive.setPower(-1);
            right_drive.setPower(-1);
            sleep(1000);
            left_drive.setPower(0);
            right_drive.setPower(0);
            // Put run blocks he.re.
            while (opModeIsActive()) {
                // Put loop blocks here.
                telemetry.update();
            }
        }
    }
}
