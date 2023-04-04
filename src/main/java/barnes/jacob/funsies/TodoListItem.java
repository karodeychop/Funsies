package barnes.jacob.funsies;


import java.time.LocalDate;

public class TodoListItem {

    private String description;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private LocalDate goal;

    public TodoListItem(String description) {
        setDescription(description);
        this.dateCreated = LocalDate.now();
        dateUpdated = dateCreated;
    }

    public TodoListItem(String description, LocalDate dateCreated) {
        this(description);
        this.dateCreated = dateCreated;
        this.dateUpdated = dateCreated;
    }

    public TodoListItem(String description, LocalDate dateCreated, LocalDate dateUpdated) {
        this(description, dateCreated);
        this.dateUpdated = dateUpdated;
    }

    public TodoListItem(String description, LocalDate dateCreated, LocalDate dateUpdated, LocalDate goal) {
        this(description, dateCreated, dateUpdated);
        this.setGoal(goal);
    }

    public void setDescription(String description) {
        this.description = description;
        this.dateUpdated = LocalDate.now();
    }

    public void setGoal(LocalDate goalDate) {
        this.goal = goalDate;
    }

    public String toString() {
        String toReturn = "";
        toReturn += "Description: " + description + "\n";
        toReturn += "Date created: " + dateCreated + "\n";
        toReturn += "Goal date: " + goal + "\n";
        toReturn += "Date updated: " + dateUpdated;

        return toReturn;
    }
}
