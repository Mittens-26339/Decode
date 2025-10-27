package org.firstinspires.ftc.teamcode.Ri3D; // make sure this aligns with class location
import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.Path;
import com.pedropathing.paths.PathChain;
import com.pedropathing.util.Timer;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import  com.qualcomm.robotcore.eventloop.opmode.OpMode;
@Autonomous(name = "Example Auto", group = "Examples")
public class Auton extends OpMode {
    private Follower follower;
    private Timer pathTimer, actionTimer, opmodeTimer;
    private int pathState;


    //POSES
    private final Pose startPose = new Pose(28.5, 128, Math.toRadians(180)); // Start Pose of our robot.
    private final Pose scorePose = new Pose(60, 85, Math.toRadians(135)); // Scoring Pose of our robot. It is facing the goal at a 135 degree angle.
    private final Pose pickup1Pose = new Pose(37, 121, Math.toRadians(0)); // Highest (First Set) of Artifacts from the Spike Mark.
    private final Pose pickup2Pose = new Pose(43, 130, Math.toRadians(0)); // Middle (Second Set) of Artifacts from the Spike Mark.
    private final Pose pickup3Pose = new Pose(49, 135, Math.toRadians(0)); // Lowest (Third Set) of Artifacts from the Spike Mark.



    @Override
    public void init(){
        /** This method is called once at the init of the OpMode. **/
    }
    @Override
    public void loop(){
        /** This is the main loop of the OpMode, it will run repeatedly after clicking "Play". **/
    }
    @Override
    public void init_loop() {
        /** This method is called continuously after Init while waiting for "play". **/
    }

    @Override
    public void start() {
        /** This method is called once at the start of the OpMode.
         * It runs all the setup actions, including building paths and starting the path system **/
    }


}