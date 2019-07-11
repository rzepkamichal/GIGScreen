package model.config;

import model.Position;

import java.util.LinkedList;

/**
 * Represents default configuration for song headers.
 * Implements singleton pattern.
 */
public class HeaderConfig {

    private LinkedList<ParamConfig> config;

    private static final HeaderConfig instance = new HeaderConfig();

    private HeaderConfig(){
        config.add(new ParamConfig("T", new Position(0,0)));
        config.add(new ParamConfig("11", new Position(0,0)));
        config.add(new ParamConfig("Preset", new Position(0,0)));
    }

    public LinkedList<ParamConfig> getConfig() {
        return config;
    }

    public static HeaderConfig getInstance() {
        return instance;
    }
}
