/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg17125605_1_lab3_part1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alang
 */
public interface  Logger {
    public String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    public void log(String msg);
    
}
