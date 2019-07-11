package model.config;

import model.Position;

public class ParamConfig {

    private String paramTitle = "";
    private Position position;

    public ParamConfig(String paramTitle, Position position) {
        this.paramTitle = paramTitle;
        this.position = position;
    }
}
