package org.firstinspires.ftc.teamcode.Ri3D;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    private DcMotor motorFrontRight, motorBackRight, motorFrontLeft, motorBackLeft;

    private double SPIN_DAMPING = 2.0; //higher means slower turning

    public void init(HardwareMap hwMap){
        motorFrontRight = hwMap.get(DcMotor.class, "mfr");
        motorBackRight = hwMap.get(DcMotor.class, "mbr");
        motorFrontLeft = hwMap.get(DcMotor.class, "mfl");
        motorBackLeft = hwMap.get(DcMotor.class, "mbl");

        motorFrontLeft.setDirection(DcMotor.Direction.REVERSE);    //reverse left front motor
        motorFrontRight.setDirection(DcMotor.Direction.FORWARD);    //forward right front motor
        motorBackLeft.setDirection(DcMotor.Direction.REVERSE);    //reverse left back motor
        motorBackRight.setDirection(DcMotor.Direction.FORWARD);
        motorFrontLeft.setZeroPowerBehavior(BRAKE);    // stop front left when no power
        motorFrontRight.setZeroPowerBehavior(BRAKE);    // stop front right
        motorBackLeft.setZeroPowerBehavior(BRAKE);    // stop back left
        motorBackRight.setZeroPowerBehavior(BRAKE);
    }

    void mecanumDrive(double forward, double strafe, double rotate){
        double leftFrontPower;
        double rightFrontPower;
        double leftBackPower;
        double rightBackPower;
        /* the denominator is the largest motor power (absolute value) or 1
         * This ensures all the powers maintain the same ratio,
         * but only if at least one is out of the range [-1, 1]
         */
        double denominator = Math.max(Math.abs(forward) + Math.abs(strafe) + Math.abs(rotate), 1);

        leftFrontPower = (forward + strafe + rotate) / denominator *0.8;
        rightFrontPower = (forward - strafe - rotate) / denominator*0.8;
        leftBackPower = (forward - strafe + rotate) / denominator*0.8;
        rightBackPower = (forward + strafe - rotate) / denominator*0.8;

        motorFrontLeft.setPower(leftFrontPower);
        motorFrontRight.setPower(rightFrontPower);
        motorBackLeft.setPower(leftBackPower);
        motorBackLeft.setPower(rightBackPower);

    }
}
