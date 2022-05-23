package com.pike;

public class Driver {

    private int points;
    private DriversEnum name;
    private TeamEnum team;

    public Driver(TeamEnum team, DriversEnum name, int points) {
        this.team = team;
        this.name = name;
        this.points = points;
    }

    public Driver(TeamEnum team, DriversEnum name) {
        this.team = team;
        this.name = name;
        this.points = findPoints(name);
    } 

    public Driver(DriversEnum name) {
        this.team = findTeam(name);
        this.name = name;
        this.points = findPoints(name);
    }

    public Driver(TeamEnum team) {
        this.team = team;
        this.points = findTeamPoints(team);
    }
    
    private int findTeamPoints(TeamEnum team) {
        int total = 0;
        switch (team.toString()) {
            case "RED_BULL":
                total += findPoints(DriversEnum.VERSTAPPEN);
                total += findPoints(DriversEnum.PEREZ);
                break;
            case "FERRARI":
                total += findPoints(DriversEnum.LECLERC);
                total += findPoints(DriversEnum.SAINZ);
                break;
            case "MERCEDES":
                total += findPoints(DriversEnum.HAMILTON);
                total += findPoints(DriversEnum.RUSSELL);
                break;
            case "MCLAREN":
                total += findPoints(DriversEnum.RICCIARDO);
                total += findPoints(DriversEnum.NORRIS);
                break;
            case "ALFAROMEO":
                total += findPoints(DriversEnum.BOTTAS);
                total += findPoints(DriversEnum.ZHOU);
                break;
            case "ALPINE":
                total += findPoints(DriversEnum.OCON);
                total += findPoints(DriversEnum.ALONSO);
                break;
            case "ALPHATAURI":
                total += findPoints(DriversEnum.GASLY);
                total += findPoints(DriversEnum.TSUNODA);
                break;
            case "HAAS":
                total += findPoints(DriversEnum.MAGNUSSEN);
                total += findPoints(DriversEnum.SCHUMACHER);
                break;
            case "ASTON_MARTIN":
                total += findPoints(DriversEnum.STROLL);
                total += findPoints(DriversEnum.VETTEL);
                break;
            case "WILLIAMS":
                total += findPoints(DriversEnum.LATIFI);
                total += findPoints(DriversEnum.ALBON);
                break;
            default:
                System.err.println("DEFAULT CASE!\n\nIn: findTeamPoints()");
                break;
        }
        return total;
    }

    private int findPoints(DriversEnum name) {
        int pnt;
        // TODO: create a file where you can get points.
        switch (name.toString()) {
            case "VERSTAPPEN":
                pnt = 110;
                break;
            case "PEREZ":
                pnt = 85;
                break;
            case "LECLERC":
                pnt = 104;
                break;
            case "SAINZ":
                pnt = 65;
                break;
            case "RUSSELL":
                pnt = 74;
                break;
            case "HAMILTON":
                pnt = 46;
                break;
            case "NORRIS":
                pnt = 39;
                break;
            case "BOTTAS":
                pnt = 38;
                break;
            case "OCON":
                pnt = 30;
                break;
            case "MAGNUSSEN":
                pnt = 15;
                break;
            case "TSUNODA":
                pnt = 11;
                break;
            case "RICCIARDO":
                pnt = 11;
                break;
            case "GASLY":
                pnt = 6;
                break;
            case "VETTEL":
                pnt = 4;
                break;
            case "ALONSO":
                pnt = 4;
                break;
            case "ALBON":
                pnt = 3;
                break;
            case "STROLL":
                pnt = 2;
                break;
            case "ZHOU":
                pnt = 1;
                break;
            case "SCHUMACHER":
                pnt = 0;
                break;
            case "LATIFI":
                pnt = 0;
                break;
            default:
                pnt = 0;
                break;
            }
        return pnt;
    }
    
    private TeamEnum findTeam(DriversEnum name) {
        TeamEnum tm;
        // TODO: create a file where you can get points.
        switch (name.toString()) {
            case "VERSTAPPEN":
                tm = TeamEnum.RED_BULL;
                break;
            case "PEREZ":
                tm = TeamEnum.RED_BULL;
                break;
            case "LECLERC":
                tm = TeamEnum.FERRARI;
                break;
            case "SAINZ":
                tm = TeamEnum.FERRARI;
                break;
            case "RUSSELL":
                tm = TeamEnum.MERCEDES;
                break;
            case "HAMILTON":
                tm = TeamEnum.MERCEDES;
                break;
            case "NORRIS":
                tm = TeamEnum.MCLAREN;
                break;
            case "RICCIARDO":
                tm = TeamEnum.MCLAREN;
                break;
            case "BOTTAS":
                tm = TeamEnum.ALFAROMEO;
                break;
            case "ZHOU":
                tm = TeamEnum.ALFAROMEO;
                break;
            case "OCON":
                tm = TeamEnum.ALPINE;
                break;
            case "ALONSO":
                tm = TeamEnum.ALPINE;
                break;
            case "TSUNODA":
                tm = TeamEnum.ALPHATAURI;
                break;
            case "GASLY":
                tm = TeamEnum.ALPHATAURI;
                break;
            case "MAGNUSSEN":
                tm = TeamEnum.HAAS;
                break;
            case "SCHUMACHER":
                tm = TeamEnum.HAAS;
                break;
            case "VETTEL":
                tm = TeamEnum.ASTON_MARTIN;
                break;
            case "STROLL":
                tm = TeamEnum.ASTON_MARTIN;
                break;
            case "ALBON":
                tm = TeamEnum.WILLIAMS;
                break;
            case "LATIFI":
                tm = TeamEnum.WILLIAMS;
                break;
            default:
                tm = null;
                break;
            }
        return tm;
    }

    public int getPoints() { return this.points; }
    public String getName() { return this.name.toString(); }
    public String getTeam() { return this.team.toString(); }
    public void setPoints(int points) { this.points=points; }
    public void addPoints(int points) { this.points+=points; }

    @Override
    public String toString() {
        return (this.getTeam() + " | " + this.getName() + " | " + this.getPoints());
    }

}
