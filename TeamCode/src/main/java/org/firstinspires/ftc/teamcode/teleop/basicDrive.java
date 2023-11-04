package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "basicDrive")
public class basicDrive extends LinearOpMode {

    private DcMotor FrontRight;
    private DcMotor BackRight;
    private DcMotor FrontLeft;
    private DcMotor BackLeft;
    private Servo   ClawServo;
    private DcMotor ArmMotor;

     // private final ElapsedTime intakeTimer = new ElapsedTime();
     // intakeState = IntakeState.RESTING;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() throws InterruptedException {
        double Launch_Angle;

        FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        BackRight = hardwareMap.get(DcMotor.class, "BackRight");
        FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        ArmMotor = hardwareMap.get(DcMotor.class, "ArmMotor");
        ClawServo = hardwareMap.get(Servo.class, "ClawServo");



        // Put initialization blocks here.
        waitForStart();
        FrontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        BackRight.setDirection(DcMotorSimple.Direction.FORWARD);
        FrontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        BackLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        ArmMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        ClawServo.setDirection(Servo.Direction.FORWARD);
        FrontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        FrontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        BackLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        ArmMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        ClawServo.setPosition(.1);




        if (opModeIsActive()) {
            FrontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            BackRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            FrontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            BackLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            ArmMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            // Put run blocks here.


                FrontRight.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x) / 1);
                BackRight.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x) / 1);
                FrontLeft.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x) / 1);
                BackLeft.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x) / 1);

                while (gamepad1.right_bumper) {

                    FrontRight.setPower(0.5);
                    BackRight.setPower(0.5);
                    FrontLeft.setPower(-0.5);
                    BackLeft.setPower(-0.5);
                }

                while (gamepad1.left_bumper) {

                    FrontRight.setPower(-0.5);
                    BackRight.setPower(-0.5);
                    FrontLeft.setPower(0.5);
                    BackLeft.setPower(0.5);
                }
                if (gamepad1.a) {

                    ClawServo.setPosition(0);
                }

                if (gamepad1.b) {

                    ClawServo.setPosition(0.18);
                }

                if (gamepad1.x) {

                    ArmMotor.setTargetPosition(250);
                    ArmMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                    ArmMotor.setPower(1);
                }

                if (gamepad1.y) {

                    //plane
                 }

            telemetry.update();
            }
        }
    }

