package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "AUTO_PRIME", group = "Autonomous")
@Disabled
public class AUTO_PRIME extends LinearOpMode {

    Robot robot;

    
    void initAuto(){
        ElapsedTime timer = new ElapsedTime();
        this.robot = new Robot(this, hardwareMap, telemetry, timer, false);

        robot.delivery.initEncoders();

        robot.vision.activateYellowPipelineCamera1();

        robot.vision.activateAprilTagYellowPipelineCamera2();

        //robot.delivery.closeGripper();

        robot.sensors.deployOdo();

        robot.sensors.setLEDState(Sensors.LED_STATE.DEFAULT);

    }
    
    @Override
    public void runOpMode() throws InterruptedException{

    }
    
    

    
    
}
