package com.example.codingmaster.chaindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codingmaster.slib.S;

public class MainActivity extends AppCompatActivity {
    private int cmds[] = {1, 2, 2, 3, 1};
    RobotHandlerManager<String> handlerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S.init(true, 1, "SLOG");
        handlerManager = new RobotHandlerManager.HandlersBuilder<String>()
                .addHandler(new HandleCMD1())
                .addHandler(new HandleCMD2())
                .build();
        for (int i = 0; i < cmds.length; i++) {
            cmdHandler(cmds[i], "CMD" + cmds[i]);
        }
    }

    private void cmdHandler(int cmd, String data) {
        handlerManager.handle(cmd, data);
    }
}
