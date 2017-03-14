package com.example.codingmaster.chaindemo;


/**
 * Description:
 *
 * @author 王强 Email: 249346538@qq.com 2017/2/25.
 * @version 1.0
 */

public abstract class RobotHandler<D> {
    protected RobotHandler<D> nextHandler;

    public RobotHandler() {
    }

    public abstract void handle(int cmd,D data);

    public void setNextHandler(RobotHandler<D> handler) {
        this.nextHandler = handler;
    }
}
