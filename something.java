package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.AUTO_PRIME;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name="something", group="Autonomous")
public class something extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();

        Pose2d original = new Pose2d(0, 0, (Math.toRadians(0)));
        robot.drive.setPoseEstimate(original);

        TrajectorySequence move = robot.drive.trajectorySequenceBuilder(original)
                .lineTo(new Vector2d(0, 40))
                .waitSeconds(2)
                .lineTo(new Vector2d(30, 40))
                .build();

        TrajectorySequence twist = robot.drive.trajectorySequenceBuilder(original)
                .lineToLinearHeading(new Pose2d(-4, 12, (Math.toRadians(90))))
                .build();

        TrajectorySequence spline = robot.drive.trajectorySequenceBuilder(original)
                .splineToConstantHeading(new Vector2d(50, 40), Math.toRadians(180))
                .build();

        waitForStart();

        //robot.drive.followTrajectorySequence(move);
        //robot.drive.followTrajectorySequence(twist);
        robot.drive.followTrajectorySequence(spline);
    }


}
