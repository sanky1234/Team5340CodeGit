package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import java.io.FileNotFoundException;

/**
 * Created by robotadmin on 3/22/2017.
 */


@Autonomous(name="Logger Test", group="Pushbot")
@Disabled

public class TestLogger extends CommonFunctions {
    Logger TestLogger;

    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        try {
            TestLogger = new Logger(true, "Test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        TestLogger.printMessage("TestLogger", "Hello World!");
        TestLogger.printMessage("TestLogger", "Sank is dank");


    }
}