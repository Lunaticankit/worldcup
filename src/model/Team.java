package model;

public class Team {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJerseycolor() {
        return jerseycolor;
    }

    public void setJerseycolor(String jerseycolor) {
        this.jerseycolor = jerseycolor;
    }

    public String getFifaposition() {
        return fifaposition;
    }

    public void setFifaposition(String fifaposition) {
        this.fifaposition = fifaposition;
    }

    public Team(String name, String jerseycolor, String fifaposition) {
        this.name = name;
        this.jerseycolor = jerseycolor;
        this.fifaposition = fifaposition;
    }

    String name;
    String jerseycolor;
    String fifaposition;
}

