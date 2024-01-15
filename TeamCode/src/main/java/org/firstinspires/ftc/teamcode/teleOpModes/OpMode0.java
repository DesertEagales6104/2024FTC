package org.firstinspires.ftc.teamcode.teleOpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.subSystems.Intake;

import java.lang.annotation.Annotation;

public class OpMode0 extends LinearOpMode {
    Intake intake;
    public OpMode0(){
    }

    @Override
    public void runOpMode() throws InterruptedException {
        intake = new Intake(hardwareMap);

        waitForStart();

        while(opModeIsActive() && !isStopRequested()){

            if(gamepad1.a){
                intake.setServoPos(0.3);
            }

            intake.setPower(gamepad1.left_stick_x);





        }
    }
}
