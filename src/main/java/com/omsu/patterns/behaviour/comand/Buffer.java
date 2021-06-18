package com.omsu.patterns.behaviour.comand;

public class Buffer {
    private String s;
    private StringBuilder buffer;
    private String temrString = null;
    private boolean finishString;

    public Buffer() {
        buffer = new StringBuilder();
    }

    public String getString() {
        return temrString;
    }

    public boolean IsString() {
        return temrString != null;
    }

    void setNull() {
        temrString = null;
    }

    public void setString(String s1) {
        s = s1;
    }

    void addString() {
        temrString = null;
        buffer.append(s);
    }

    void addStartString() {
        temrString = null;
    }

    void resetBuffer() {
        temrString = buffer.toString();
        if (temrString.equals("")) temrString = null;
        buffer.setLength(0);
    }

    void resetBufferTrash() {
        temrString = null;
        buffer.setLength(0);
    }
}
















































/*    public Buffer() {
        buffer = new StringBuilder();
    }

    public String getString() {
        return temrString;
    }

    public boolean IsString() {
        return temrString != null;
    }

    void setNull() {
        temrString = null;
    }

    public void setString(String s1) {
        s = s1;
    }

    void addString() {
        temrString = null;
        buffer.append(s);
    }

    void addStartString() {
        temrString = null;
        buffer.append("").append(s);
    }

    void resetBuffer() {
        temrString = buffer.toString();
        buffer.setLength(0);
    }*/