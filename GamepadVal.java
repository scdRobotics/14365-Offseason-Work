package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.ArrayList;

public class GamepadVal {

    private static Gamepad gp1;
    private static Gamepad gp2;

    public static ArrayList<GamepadVal> vals = new ArrayList<GamepadVal>();


    private double currentVal;

    private String downMod;
    private String upMod;

    private boolean isGp1;

    private boolean isHeldUp = false;
    private boolean isHeldDown = false;

    public static void initGamepads(Gamepad gp1, Gamepad gp2){
        GamepadVal.gp1=gp1;
        GamepadVal.gp2=gp2;
    }

    public GamepadVal(double startingVal, String downMod, String upMod, boolean isGp1){
        currentVal = startingVal;
        this.downMod=downMod;
        this.upMod=upMod;
        this.isGp1=isGp1;
        vals.add(this);
    }

    public double getCurrentVal(){
        return currentVal;
    }

    public static double getValsSize(){
        return vals.size();
    }

    public static void refreshVals(){
        for(GamepadVal val: vals){
            if(val.heldCheckDown()){
                val.currentVal--;
            }
            else if(val.heldCheckUp()){
                val.currentVal++;
            }

        }
    }

    public boolean isHeldUp(){
        return isHeldUp;
    }

    public boolean isHeldDown(){
        return isHeldDown;
    }

    public boolean heldCheckUp(){
        if(uglySwitchCaseBecauseJavaSucksUP() && !isHeldUp){
            isHeldUp=true;
            System.out.println(isHeldUp);
            return true;
        }
        isHeldUp = false;
        System.out.println(isHeldUp);
        return false;
    }

    public boolean heldCheckDown(){
        if(uglySwitchCaseBecauseJavaSucksDOWN() && !isHeldDown){
            isHeldDown=true;
            System.out.println(isHeldDown);
            return true;
        }
        isHeldDown = false;
        System.out.println(isHeldDown);
        return false;
    }

    public boolean uglySwitchCaseBecauseJavaSucksUP() {
        switch (upMod) {
            case "right_bumper":
                if (isGp1) {
                    return gp1.right_bumper;
                } else {
                    return gp2.right_bumper;
                }

            case "left_bumper":
                if (isGp1) {
                    return gp1.left_bumper;
                } else {
                    return gp2.left_bumper;
                }

            case "dpad_up":
                if (isGp1) {
                    return gp1.dpad_up;
                } else {
                    return gp2.dpad_up;
                }

            case "dpad_down":
                if (isGp1) {
                    return gp1.dpad_down;
                } else {
                    return gp2.dpad_down;
                }

            case "dpad_right":
                if (isGp1) {
                    return gp1.dpad_right;
                } else {
                    return gp2.dpad_right;
                }

            case "dpad_left":
                if (isGp1) {
                    return gp1.dpad_left;
                } else {
                    return gp2.dpad_left;
                }

            case "right_trigger":
                if (isGp1) {
                    return gp1.right_trigger > 0.25;
                } else {
                    return gp2.right_trigger > 0.25;
                }

            case "left_trigger":
                if (isGp1) {
                    return gp1.left_trigger > 0.25;
                } else {
                    return gp2.left_trigger > 0.25;
                }

            case "a":
                if (isGp1) {
                    return gp1.a;
                } else {
                    return gp2.a;
                }

            case "b":
                if (isGp1) {
                    return gp1.b;
                } else {
                    return gp2.b;
                }

            case "x":
                if (isGp1) {
                    return gp1.x;
                } else {
                    return gp2.x;
                }

            case "y":
                if (isGp1) {
                    return gp1.y;
                } else {
                    return gp2.y;
                }

            case "right_stick_button":
                if (isGp1) {
                    return gp1.right_stick_button;
                } else {
                    return gp2.right_stick_button;
                }

            case "left_stick_button":
                if (isGp1) {
                    return gp1.left_stick_button;
                } else {
                    return gp2.left_stick_button;
                }

            case "right_stick_x":
                if (isGp1) {
                    return gp1.right_stick_x > 0.25;
                } else {
                    return gp2.right_stick_x > 0.25;
                }

            case "left_stick_x":
                if (isGp1) {
                    return gp1.left_stick_x > 0.25;
                } else {
                    return gp2.left_stick_x > 0.25;
                }

            case "right_stick_y":
                if (isGp1) {
                    return gp1.right_stick_y > 0.25;
                } else {
                    return gp2.right_stick_y > 0.25;
                }

            case "left_stick_y":
                if (isGp1) {
                    return gp1.left_stick_y > 0.25;
                } else {
                    return gp2.left_stick_y > 0.25;
                }


            default:
                return false;

        }

    }

    public boolean uglySwitchCaseBecauseJavaSucksDOWN(){
        switch(downMod){
            case "right_bumper":
                if(isGp1){
                    return gp1.right_bumper;
                }
                else{
                    return gp2.right_bumper;
                }

            case "left_bumper":
                if(isGp1){
                    return gp1.left_bumper;
                }
                else{
                    return gp2.left_bumper;
                }

            case "dpad_up":
                if(isGp1){
                    return gp1.dpad_up;
                }
                else{
                    return gp2.dpad_up;
                }

            case "dpad_down":
                if(isGp1){
                    return gp1.dpad_down;
                }
                else{
                    return gp2.dpad_down;
                }

            case "dpad_right":
                if(isGp1){
                    return gp1.dpad_right;
                }
                else{
                    return gp2.dpad_right;
                }

            case "dpad_left":
                if(isGp1){
                    return gp1.dpad_left;
                }
                else{
                    return gp2.dpad_left;
                }

            case "right_trigger":
                if(isGp1){
                    return gp1.right_trigger>0.25;
                }
                else{
                    return gp2.right_trigger>0.25;
                }

            case "left_trigger":
                if(isGp1){
                    return gp1.left_trigger>0.25;
                }
                else{
                    return gp2.left_trigger>0.25;
                }

            case "a":
                if(isGp1){
                    return gp1.a;
                }
                else{
                    return gp2.a;
                }

            case "b":
                if(isGp1){
                    return gp1.b;
                }
                else{
                    return gp2.b;
                }

            case "x":
                if(isGp1){
                    return gp1.x;
                }
                else{
                    return gp2.x;
                }

            case "y":
                if(isGp1){
                    return gp1.y;
                }
                else{
                    return gp2.y;
                }

            case "right_stick_button":
                if(isGp1){
                    return gp1.right_stick_button;
                }
                else{
                    return gp2.right_stick_button;
                }

            case "left_stick_button":
                if(isGp1){
                    return gp1.left_stick_button;
                }
                else{
                    return gp2.left_stick_button;
                }

            case "right_stick_x":
                if(isGp1){
                    return gp1.right_stick_x<-0.25;
                }
                else{
                    return gp2.right_stick_x<-0.25;
                }

            case "left_stick_x":
                if(isGp1){
                    return gp1.left_stick_x<-0.25;
                }
                else{
                    return gp2.left_stick_x<-0.25;
                }

            case "right_stick_y":
                if(isGp1){
                    return gp1.right_stick_y<-0.25;
                }
                else{
                    return gp2.right_stick_y<-0.25;
                }

            case "left_stick_y":
                if(isGp1){
                    return gp1.left_stick_y<-0.25;
                }
                else{
                    return gp2.left_stick_y<-0.25;
                }


            default:
                return false;

        }
    }

}
