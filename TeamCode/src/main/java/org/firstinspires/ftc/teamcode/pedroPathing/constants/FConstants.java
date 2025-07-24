package org.firstinspires.ftc.teamcode.pedroPathing.constants;

import com.pedropathing.localization.Localizers;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FConstants {
    static {
        // Select our localizer
        FollowerConstants.localizers = Localizers.THREE_WHEEL;
        
        // We can change the value of any variable/constant of FollowerConstants.
        FollowerConstants.mass = 10; // In kg
    }
}
