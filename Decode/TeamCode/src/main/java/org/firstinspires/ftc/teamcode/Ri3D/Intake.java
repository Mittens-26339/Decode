package org.firstinspires.ftc.teamcode.Ri3D;
import android.annotation.SuppressLint;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    private DcMotor Intake;

    public void init (HardwareMap hwMap){
        Intake = hwMap.get(DcMotor.class, "Intake");
        Intake.setDirection(DcMotor.Direction.REVERSE);
    }
    public enum IntakeState{
        ON,
        OFF;
    }
    private IntakeState intakeState = IntakeState.OFF;

    public void IntakePower(){
            switch (intakeState){
                case ON:
                    intakeState = intakeState.OFF;
                    Intake.setPower(0);
                    break;
                case OFF:
                    intakeState = intakeState.ON;
                    Intake.setPower(0.8);
                    break;
            }
        }
    }


