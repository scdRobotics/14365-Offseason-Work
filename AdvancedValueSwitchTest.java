package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import androidx.annotation.NonNull;

import com.acmerobotics.roadrunner.drive.Drive;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.constraints.MecanumVelocityConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.MinAccelerationConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.TrajectoryAccelerationConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.TrajectoryVelocityConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.TranslationalVelocityConstraint;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Autonomous(name="AdvancedValueSwitchTest", group="TestAutonomous")
public class AdvancedValueSwitchTest extends AUTO_PRIME {

    @Override
    public void runOpMode() {


        initAuto();

        waitForStart();

        GamepadVal.initGamepads(gamepad1, gamepad2);

        GamepadVal leftStickUpDownGP1 = new GamepadVal(0, "left_stick_y", "left_stick_y", true);
        GamepadVal leftStickUpDownGP2 = new GamepadVal(10, "left_stick_y", "left_stick_y", false);

        GamepadVal abGP1 = new GamepadVal(0, "a", "b", true);

        while(opModeIsActive()){
            GamepadVal.refreshVals();
            telemetry.addData("GP 1 Left Stick Up and Down: ", leftStickUpDownGP1.getCurrentVal());
            telemetry.addData("GP 2 Left Stick Up and Down: ", leftStickUpDownGP2.getCurrentVal());
            telemetry.addData("GP 1 A and B: ", abGP1.getCurrentVal());
            for(GamepadVal val: GamepadVal.vals){
                telemetry.addData("Current Val #", val.getCurrentVal());
                telemetry.addData("Is Held Up", val.isHeldUp());
                telemetry.addData("Is Held Down", val.isHeldDown());
            }
            telemetry.update();
            robot.pause(0.05);
        }




    }

}
