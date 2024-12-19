package org.example.di;

public class Player {
    private String name;
    private String specialization;
    // The tool is the dependency in this case, we could say that the Player class depends on the Tool interface
    private Tool tool;
    private int power;


    public Player(String name, String specialization, Tool tool, int power) {
        this.name = name;
        this.specialization = specialization;
        this.tool = tool;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }




    public void useTool() {
        System.out.print(this.name + " is using their tool: ");
        this.tool.use();
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", tool=" + tool +
                ", power=" + power +
                '}';
    }
}
