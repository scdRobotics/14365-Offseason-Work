package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="learning_part_2", group="Autonomous")
public class learning_part_2 extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();

        Pose2d beenus = new Pose2d(0,0, (Math.toRadians(0)));
        robot.drive.setPoseEstimate(beenus);

        TrajectorySequence something = robot.drive.trajectorySequenceBuilder(beenus)
                .lineTo(new Vector2d(0, 1))
                .build();

        waitForStart();

        robot.drive.followTrajectorySequence(something);



    }


}
