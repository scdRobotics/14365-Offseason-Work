package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="_DELIVERY_FUN", group="Autonomous")
public class _DELIVERY_FUN extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();

        waitForStart();

        robot.delivery.slideControl(robot.delivery.slideIdxToEncoderVal(2), 0.5);

        for (double i = 0; i < 1; i+=.1){
            robot.delivery.gripper.setPosition(i);
            telemetry.addData("I: ", i);
            telemetry.update();
            robot.pause(2);
        }

        robot.delivery.slideControl(900, 0.5);

        robot.pause(5);





    }


}
