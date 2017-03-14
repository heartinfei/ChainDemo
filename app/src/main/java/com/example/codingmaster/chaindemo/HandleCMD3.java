package com.example.codingmaster.chaindemo;

import com.codingmaster.slib.S;

/**
 * Created by 王强 on 2017/2/10.
 * 简介：
 */

public class HandleCMD3 extends RobotHandler<String> {

    @Override
    public void handle(int cmd, String data) {
        if (cmd == 3) {
            handleDeviceState(data);
        } else if (nextHandler != null) {
            nextHandler.handle(cmd, data);
        }
    }

    private void handleDeviceState(String data) {
        S.i("I'm HandlerCMD3 handled" + data);
    }
}
