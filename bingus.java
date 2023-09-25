package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="bingus", group="Autonomous")
public class    bingus extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();

        Pose2d cbat = new Pose2d(36, 60, (Math.toRadians(180)));
        robot.drive.setPoseEstimate(cbat);

        TrajectorySequence balls = robot.drive.trajectorySequenceBuilder(cbat)
                .splineToConstantHeading(new Vector2d(36, 48),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .splineToConstantHeading(new Vector2d(0,48),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .turn(Math.toRadians(180))
                .splineToConstantHeading(new Vector2d(0,60),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .build();

        TrajectorySequence harambe = robot.drive.trajectorySequenceBuilder(balls.end())
                .splineToConstantHeading(new Vector2d(0,48),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .turn(Math.toRadians(180))
                .splineToConstantHeading(new Vector2d(-24,24),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .build();

        TrajectorySequence bussy = robot.drive.trajectorySequenceBuilder(harambe.end())
                .splineToConstantHeading(new Vector2d(-24,12),Math.toRadians(robot.drive.getPoseEstimate().getHeading()))
                .build();
        //TrajectorySequence something = robot.drive.trajectorySequenceBuilder(bussy.end())
                //.splineToLinearHeading(new Vector2d(36, 36),Math.toRadians(180);

        waitForStart();

        robot.drive.followTrajectorySequence(balls);
        robot.delivery.closeGripper();
        robot.drive.followTrajectorySequence(harambe);
        robot.delivery.slideControl(robot.delivery.slideIdxToEncoderVal(2), 0.5);
        robot.drive.followTrajectorySequence(bussy);
        robot.delivery.openGripper();
        //robot.drive.followTrajectorySequence(something);


    }


}
