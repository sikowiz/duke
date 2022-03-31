package main.java.duke.data.entity;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
    @Override
    public String toSaveStr() {
        return "T , " + super.toSaveStr();
    }

}