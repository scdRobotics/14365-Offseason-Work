package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="_SimpleSquare", group="Autonomous")
public class _SimpleSquare extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();


        Pose2d parts = new Pose2d(0, 0, (Math.toRadians(0)));
        robot.drive.setPoseEstimate(parts);

        TrajectorySequence services = robot.drive.trajectorySequenceBuilder(parts)
                .lineTo(new Vector2d(0, 60))
                .waitSeconds(3)
                .lineTo(new Vector2d(0,-60))
                //.lineTo(new Vector2d(20, 0))
                .build();


        waitForStart();

        robot.drive.followTrajectorySequence(services);


    }


}
