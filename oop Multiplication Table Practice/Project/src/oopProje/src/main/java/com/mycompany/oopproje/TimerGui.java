
package com.mycompany.oopproje;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TimerGui {
    private JLabel jLabel3;
    private Timer timer;
    private int hour;
    private int minute;
    private int second;

    public TimerGui(JLabel jLabel) {
        hour = 0;
        minute = 0;
        second = 0;
        this.jLabel3=jLabel;
        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClockLabel(jLabel);
                incrementTime();
            }
        });

        timer.start();
    }

    private void updateClockLabel(JLabel jLabel) {
        String time = String.format("%02d:%02d:%02d", hour, minute, second);
        jLabel.setText(time);
    }
    
    public void stopTimer() {
        timer.stop();
    }
    
    private void incrementTime() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24)
                    hour = 0;
            }
        }
    }

}

