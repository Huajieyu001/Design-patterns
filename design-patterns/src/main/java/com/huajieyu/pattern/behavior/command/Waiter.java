package com.huajieyu.pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public Waiter(Command command) {
        this.commandList.add(command);
    }

    public Waiter(List<Command> commandList) {
        this.commandList = commandList;
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public void exec() {
        System.out.println("接收到命令");
        commandList.forEach(e -> {
            e.execute();
        });
    }
}
