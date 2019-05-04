package com.willwinder.universalgcodesender.types;

import com.google.common.base.Strings;

/**
 * Created by Phil on 9/6/2015.
 */
public class Macro {
    private String name;
    private String description;
    private String gcode;

    public Macro() {
    }

    public Macro(String name, String description, String gcode) {
        this.name = name;
        this.description = description;
        this.gcode = gcode;
    }

    public String getName() {
        return name;
    }

    public String getNameAndDescription(){
        if (!Strings.isNullOrEmpty(getName()) && !Strings.isNullOrEmpty(getDescription())){
            return String.format("%s: %s", getName(), getDescription());
        } else {
            if (!Strings.isNullOrEmpty(getName())){
                return this.getName();
            } else if (!Strings.isNullOrEmpty(getDescription())){
                return this.getDescription();
            } else {
                return "";
            }
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGcode() {
        return gcode;
    }

    public void setGcode(String gcode) {
        this.gcode = gcode;
    }

    @Override
    public String toString() {
        return "Macro{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gcode='" + gcode + '\'' +
                '}';
    }
}
