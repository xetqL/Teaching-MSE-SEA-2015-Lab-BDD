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
public class Trumpet implements IInstrument{

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getColor() {
        return "golden";
    }
    
}
