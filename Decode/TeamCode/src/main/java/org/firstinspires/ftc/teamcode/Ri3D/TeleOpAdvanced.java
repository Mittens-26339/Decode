package org.firstinspires.ftc.teamcode.Ri3D;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpAdvanced extends OpMode {
    Drivetrain drive = new Drivetrain();
    Intake intake = new Intake();

    @Override
    public void init(){
        drive.init(hardwareMap);
        intake.init(hardwareMap);

    }

    @Override
    public void loop(){
    drive.mecanumDrive(-gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);

    if (gamepad1.aWasPressed()){
        intake.IntakePower();
    }
    }
}
