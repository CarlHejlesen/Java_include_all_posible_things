package medium_functionalities;


// Required imports for file reading and managing collections.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Defines a simple class to hold information about a group.
class Group {
    // Properties of the group.
    String courseId;
    String groupId;
    int numMembers;
    List<String> members; // List to store member names.

    // Constructor to initialize group properties.
    Group(String courseId, String groupId, int numMembers) {
        this.courseId = courseId;
        this.groupId = groupId;
        this.numMembers = numMembers;
        this.members = new ArrayList<>(); // Initializes the list of members.
    }

    // Method to add a member to the group.
    void addMember(String member) {
        members.add(member); // Adds a member's name to the list.
    }
}

// Main class to demonstrate reading from a CSV file.
public class CSVReaderExample {
    
    // Entry point of the program.
    public static void main(String[] args) {
        // Path to the CSV file that will be read.
        String fileName = "medium_functionalities/csvfile.csv";
        
        // List to hold Group objects after parsing the CSV file.
        List<Group> groups = new ArrayList<>();
        // Temporary Group object to hold the current group being processed.
        Group currentGroup = null;
        // Counter to keep track of how many members need to be read for the current group.
        int membersToRead = 0;
        
        // Try-with-resources to ensure the BufferedReader is closed after use.
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line; // Variable to hold each line read from the file.
            // Loop to read the file line by line until the end of the file.
            while ((line = br.readLine()) != null) {
                // Check if the line is a group header (contains commas).
                if (line.contains(",")) {
                    // Split the line by commas and initialize a new Group object.
                    String[] parts = line.split(",");
                    currentGroup = new Group(parts[0], parts[1], Integer.parseInt(parts[2]));
                    groups.add(currentGroup); // Add the new group to the list of groups.
                    membersToRead = Integer.parseInt(parts[2]); // Set how many members to read for this group.
                } else {
                    // If it's not a group header, it must be a member.
                    if (currentGroup != null && membersToRead > 0) {
                        // Add the member to the current group and decrement the counter.
                        currentGroup.addMember(line.split(",")[1]);
                        membersToRead--;
                    }
                }
            }
        } catch (IOException e) {
            // If an error occurs during file reading, print the stack trace.
            e.printStackTrace();
        }
        
        // The list `groups` now contains all the groups with their members.
        // Below is an example of iterating over it to process or display the data.
        
        // Loop through the list of groups and print out their details.
        for (Group group : groups) {
            System.out.println("Course ID: " + group.courseId + ", Group ID: " + group.groupId);
            // Loop through the members of each group and print their names.
            for (String member : group.members) {
                System.out.println(" - " + member);
            }
        }
    }
}