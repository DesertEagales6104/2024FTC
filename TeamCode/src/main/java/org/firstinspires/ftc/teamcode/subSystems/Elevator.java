package org.firstinspires.ftc.teamcode.subSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Elevator {

    DcMotor dcMotor;

    public Elevator(HardwareMap hardwareMap){
        dcMotor = hardwareMap.dcMotor.get("elevatorMotor");
//      dcMotor.getZeroPowerBehavior();
       dcMotor.setDirection(DcMotorSimple.Direction.FORWARD);

    }
}
sahksadkjhsadkjsadkjsakj
sdksahdkjsahdkjsad
        askhdkandlkjsahdka