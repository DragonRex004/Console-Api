package de.dragonrex.command;

import java.util.ArrayList;

public interface ICommand {
    String name();

    String desc();

    CommandResponse onExecute(String name, ArrayList<String> args);
}
