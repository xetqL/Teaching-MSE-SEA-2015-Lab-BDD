/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author antho
 */
public class Flute implements IInstrument{


    @Override
    public String play() {
        return "Pfuuu";
    }

    @Override
    public int getSoundVolume() {
        return Integer.MIN_VALUE;
    }

    @Override
    public String getColor() {
        return "black";
    }
    
}
