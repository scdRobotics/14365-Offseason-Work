package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequenceBuilder;

@Autonomous(name="_SPLINE_TRAVEL", group="Autonomous")
public class _SPLINE_TRAVEL extends AUTO_PRIME {

    @Override
    public void runOpMode() throws InterruptedException{

        initAuto();

        Pose2d penis = new Pose2d(-60, 36, (Math.toRadians(0)));
        robot.drive.setPoseEstimate(penis);

        TrajectorySequence balls = robot.drive.trajectorySequenceBuilder(penis)
                .splineToSplineHeading(new Pose2d(12, 36,Math.toRadians(270)),Math.toRadians(270))
                .splineToSplineHeading(new Pose2d(12,-60,Math.toRadians(270)),Math.toRadians(270))
                .build();

        waitForStart();
        robot.drive.followTrajectorySequence(balls);


    }

    private void build() {
    }

    private void splineToSplineHeading(Vector2d vector2d, double toRadians) {
    }

    private void splineToLinearHeading(Pose2d pose2d, double toRadians) {
    }

    private void splineToConstantHeading(Vector2d vector2d, double toRadians) {
    }


}
