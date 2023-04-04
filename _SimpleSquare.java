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

        Pose2d penis = new Pose2d(0, 0, (Math.toRadians(0)));
        robot.drive.setPoseEstimate(penis);

        TrajectorySequence balls = robot.drive.trajectorySequenceBuilder(penis)
                .splineToConstantHeading(new Vector2d(20, 0),Math.toRadians(0))
                .splineToLinearHeading(new Pose2d(20, 20,Math.toRadians(180)),Math.toRadians(180))
                .splineToLinearHeading(new Pose2d(0, 20),Math.toRadians((180)))
                .splineToLinearHeading(new Pose2d(0,0),Math.toRadians(180))
                .build();

        /*TrajectorySequence boobies = robot.drive.trajectorySequenceBuilder(balls.end())
                .lineToSplineHeading(new Pose2d(20, 20, Math.toRadians(180)))
                .build();

        TrajectorySequence pp = robot.drive.trajectorySequenceBuilder(boobies.end())
                .lineTo(new Vector2d(0, 20))
                .build();

        TrajectorySequence cock = robot.drive.trajectorySequenceBuilder(pp.end())
                .lineTo(new Vector2d(0,0))
                .build();

         */


        waitForStart();

        robot.drive.followTrajectorySequence(balls);
        /*
        robot.drive.followTrajectorySequence(boobies);
        robot.drive.followTrajectorySequence(pp);
        robot.drive.followTrajectorySequence(cock);

         */



    }


}
