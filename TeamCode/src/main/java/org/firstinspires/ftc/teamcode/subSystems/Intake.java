package org.firstinspires.ftc.teamcode.subSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Intake {
    DcMotor dcMotor;
    Servo servo;
    public Intake(HardwareMap hardwareMap){
        dcMotor = hardwareMap.dcMotor.get("intakeMotor");
//      dcMotor.getZeroPowerBehavior();
        dcMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        servo=hardwareMap.servo.get("intakeServo");
    }

    public void setPower(double power){
        dcMotor.setPower(power);
    }

    public void setServoPos(double pos){
        servo.setPosition(pos);
    }

}
