package basetask;

public class Obstacle {
    private String severity;
    private String description;

    public Obstacle(String severity, String description) {
        this.description = description;
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public String getDescription() {
        return description;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствиие " + description);
    }

}
