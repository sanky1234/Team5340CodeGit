package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import java.io.IOException;

@Autonomous(name="AutoOneBeaconRed", group="Autonomous")
public class AutoOneBeaconRed extends CommonFunctions{
    final String AllianceColor = "RED";

    @Override
    public void runOpMode() throws InterruptedException {
        AutonomyMotorAndSensorSetup();
        startCamera();
        waitForStart();

        while(gyro.isCalibrating()){

        }

//        AlignWithLineUsingODS(AllianceColor, 0.17); //use 0.17 power

//        TrackLineInwards();

//        RedOrBlue();

//        PushButton(AllianceColor);

//        shootBalls();
//
//        sleep(3000);
//
//        stopShootingBalls();

        SquareUpWithWallUsingDistance();

        gyro.resetZAxisIntegrator();

        DriveBackwardWithEncoder(15, 0.3);

        turnRight(70);

        DriveForwardWithEncoder(48, 0.3);

        AlignWithLineUsingODS(AllianceColor, 0.17);

        TrackLineInwards();

        RedOrBlue();

        try {
            PushButton(AllianceColor);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        DriveForwardWithEncoder(10, 0.4);

        turnLeft(30);

        DriveForwardWithEncoder(35, 0.4);

        InterceptLine(AllianceColor); //Use the ODS to intercept the line.

        SnapBackToLine(AllianceColor); //Intercept the line in between both ODS Sensors
        firstLineDone = true;
//
//        ///////////////////////////////////////////////////////STOPPING POINT - Here we decide where to go -- should we use the gyro to drive straight or use the ODS to track? All of this depends on the angle that we have after the snap back.
//
//        DriveForwardWithDistanceSensor(5); //Option 1 ----- Need to look at how the gyro keeps us straight
        TrackLineInwards(); //Option 2
//
        RedOrBlue(); //Use the camera to detect color and assign it to our color string
//
        PushButton(AllianceColor);

        shootBalls();

        sleep(3000); // was 3

        stopShootingBalls();

        stopCamera();

        /*

        DriveBackwardWithEncoder(DriveBackDistance, 0.5); //Need to find a solid drive back distance

        StopDriveMotorsAndWait(500);

      //  DriveBackwardWithEncoder(10,0.5);

        turnRight(53); //Turn to face the next line was 75 // was 60 // was 55 // was50 // was 53

        DriveForwardWithEncoder(45, 0.3); //Drive towards it and get close
       // sleep(5000);

        InterceptLine(AllianceColor); //Intercept the second line

        SnapBackToLine(AllianceColor); //Snap back to it

        TrackLineInwards(); //Option 2
//
        RedOrBlue(); //Use the camera to detect color and assign it to our color string
//
        PushButton(AllianceColor);

        stopCamera();

//
//        ///////////////////////////////////////////////////////////////////////SAME DECISION AS ABOVE///////////////////////////////////
//
//        /*
//        DriveForwardWithDistanceSensor(5); //Option 1 ----- Need to look at how the gyro keeps us straight
//        TrackLineInwards(); //Option 2
//        */
//
//        RedOrBlue(); //Use the camera to detect color and assign it to our color string
//
//        PushButton(AllianceColor);
//
//        stopCamera();
//        stop();
    }

}