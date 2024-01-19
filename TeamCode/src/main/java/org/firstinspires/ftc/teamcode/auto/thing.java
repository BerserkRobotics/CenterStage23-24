package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

    @Autonomous(name = "Frbluestraferight", preselectTeleOp = "Full drive")
    public class thing extends LinearOpMode {

        private DcMotor FrontRight;
        private DcMotor BackRight;
        private DcMotor FrontLeft;
        private DcMotor BackLeft;
        private DcMotor LSlideMotor;
        private DcMotor RSlideMotor;
        private Servo RArmServo;
        private Servo TClawServo;
        private Servo BClawServo;
        private Servo LArmServo;
        private Servo PlaneLift;

        /**
         * This function is executed when this OpMode is selected from the Driver Station.
         */
        @Override
        public void runOpMode() {
            FrontRight = hardwareMap.get(DcMotor.class, "FrontRight");
            BackRight = hardwareMap.get(DcMotor.class, "BackRight");
            FrontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
            BackLeft = hardwareMap.get(DcMotor.class, "BackLeft");
            LSlideMotor = hardwareMap.get(DcMotor.class, "LSlideMotor");
            RSlideMotor = hardwareMap.get(DcMotor.class, "RSlideMotor");
            RArmServo = hardwareMap.get(Servo.class, "RArmServo");
            TClawServo = hardwareMap.get(Servo.class, "TClawServo");
            BClawServo = hardwareMap.get(Servo.class, "BClawServo");
            LArmServo = hardwareMap.get(Servo.class, "LArmServo");
            PlaneLift = hardwareMap.get(Servo.class, "PlaneLift");

            // Put initialization blocks here.
            FrontRight.setDirection(DcMotor.Direction.REVERSE);
            BackRight.setDirection(DcMotor.Direction.FORWARD);
            FrontLeft.setDirection(DcMotor.Direction.FORWARD);
            BackLeft.setDirection(DcMotor.Direction.REVERSE);
            FrontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            BackRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            FrontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            BackLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            FrontRight.setPower(0);
            BackRight.setPower(0);
            FrontLeft.setPower(0);
            BackLeft.setPower(0);
            LSlideMotor.setDirection(DcMotor.Direction.FORWARD);
            RSlideMotor.setDirection(DcMotor.Direction.REVERSE);
            LSlideMotor.setPower(0);
            RSlideMotor.setPower(0);
            LSlideMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            RSlideMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            RArmServo.setDirection(Servo.Direction.REVERSE);
            TClawServo.setPosition(0);
            BClawServo.setPosition(0);
            LArmServo.setPosition(0.04);
            RArmServo.setPosition(0.04);
            LSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            RSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            LSlideMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            RSlideMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            waitForStart();
            if (opModeIsActive()) {
                // Put run blocks here.
                // Zone 1, far blue
                // lft
                BClawServo.setPosition(0.05);
                TClawServo.setPosition(0.03);
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(100);
                BackRight.setTargetPosition(-100);
                FrontLeft.setTargetPosition(-100);
                FrontRight.setTargetPosition(100);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(0.5);
                BackRight.setPower(0.5);
                FrontLeft.setPower(0.5);
                FrontRight.setPower(0.5);
                sleep(500);
                // fwd
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(1329);
                BackRight.setTargetPosition(1329);
                FrontLeft.setTargetPosition(1329);
                FrontRight.setTargetPosition(1329);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(0.7);
                BackRight.setPower(0.7);
                FrontLeft.setPower(0.7);
                FrontRight.setPower(0.7);
                sleep(2000);
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(-140);
                BackRight.setTargetPosition(-140);
                FrontLeft.setTargetPosition(-140);
                FrontRight.setTargetPosition(-140);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(0.5);
                BackRight.setPower(0.5);
                FrontLeft.setPower(0.5);
                FrontRight.setPower(0.5);
                sleep(1000);
                LSlideMotor.setTargetPosition(200);
                RSlideMotor.setTargetPosition(200);
                LSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                RSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                LSlideMotor.setPower(1);
                RSlideMotor.setPower(1);
                sleep(1000);
                LArmServo.setPosition(0.2);
                RArmServo.setPosition(0.2);
                sleep(500);
                BClawServo.setPosition(0);
                TClawServo.setPosition(0.03);
                sleep(1000);
                // bk
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(-90);
                BackRight.setTargetPosition(-90);
                FrontLeft.setTargetPosition(-90);
                FrontRight.setTargetPosition(-90);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(1000);
                // rght
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(-684);
                BackRight.setTargetPosition(684);
                FrontLeft.setTargetPosition(684);
                FrontRight.setTargetPosition(-684);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(1000);
                // fwd
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(1002);
                BackRight.setTargetPosition(1002);
                FrontLeft.setTargetPosition(1002);
                FrontRight.setTargetPosition(1002);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(1000);
                // trn cntrclkws
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(950);
                BackRight.setTargetPosition(-950);
                FrontLeft.setTargetPosition(950);
                FrontRight.setTargetPosition(-950);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(1000);
                LArmServo.setPosition(0);
                RArmServo.setPosition(0);
                TClawServo.setPosition(0.03);
                BClawServo.setPosition(0);
                sleep(500);
                LSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                RSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                LSlideMotor.setTargetPosition(0);
                RSlideMotor.setTargetPosition(0);
                LSlideMotor.setPower(1);
                RSlideMotor.setPower(1);
                LSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                RSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                sleep(1000);
                PlaneLift.setPosition(0.15);
                sleep(500);
                PlaneLift.setPosition(0);
                // fwd
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(4325);
                BackRight.setTargetPosition(4325);
                FrontLeft.setTargetPosition(4325);
                FrontRight.setTargetPosition(4325);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(3000);
                // lft
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(1600);
                BackRight.setTargetPosition(-1600);
                FrontLeft.setTargetPosition(-1600);
                FrontRight.setTargetPosition(1600);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                sleep(3000);
                // arm up and clw out
                BClawServo.setPosition(0.05);
                sleep(100);
                LSlideMotor.setTargetPosition(400);
                RSlideMotor.setTargetPosition(400);
                LSlideMotor.setPower(1);
                RSlideMotor.setPower(1);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                sleep(500);
                LArmServo.setPosition(0.35);
                RArmServo.setPosition(0.35);
                sleep(500);
                // fwd
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(200);
                BackRight.setTargetPosition(200);
                FrontLeft.setTargetPosition(200);
                FrontRight.setTargetPosition(200);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                sleep(1000);
                TClawServo.setPosition(0);
                BClawServo.setPosition(0);
                sleep(500);
                // bk
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(-100);
                BackRight.setTargetPosition(-100);
                FrontLeft.setTargetPosition(-100);
                FrontRight.setTargetPosition(-100);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                sleep(500);
                LArmServo.setPosition(0);
                RArmServo.setPosition(0);
                TClawServo.setPosition(0);
                BClawServo.setPosition(0);
                sleep(500);
                LSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                RSlideMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
                LSlideMotor.setTargetPosition(0);
                RSlideMotor.setTargetPosition(0);
                LSlideMotor.setPower(1);
                RSlideMotor.setPower(1);
                LSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                RSlideMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                sleep(500);
                // rght
                BackLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                FrontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                BackLeft.setTargetPosition(-1100);
                BackRight.setTargetPosition(1100);
                FrontLeft.setTargetPosition(1100);
                FrontRight.setTargetPosition(-1100);
                BackLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                BackRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                FrontLeft.setPower(1);
                FrontRight.setPower(1);
                BackLeft.setPower(1);
                BackRight.setPower(1);
                while (opModeIsActive()) {
                    // Put loop blocks here.
                    telemetry.update();
                }
            }
        }
    }
}
