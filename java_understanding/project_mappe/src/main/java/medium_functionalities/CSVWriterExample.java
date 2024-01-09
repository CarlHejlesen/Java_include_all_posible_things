package medium_functionalities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

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

public class CSVWriterExample {

    // A method that writes a list of Group objects to a CSV file.
    public static void writeGroupsToFile(List<Group> groups, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Group group : groups) {
                bw.write(group.courseId + "," + group.groupId + "," + group.numMembers);
                bw.newLine();
                
                for (String member : group.members) {
                    bw.write(member);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        List<Group> groups = new ArrayList<>();

        // Populate the groups list here based on your CSV format
        // The following is an example based on the CSV format you provided:
        groups.add(createGroup("OOP", "oop-01", 5, new String[]{"1,Jan", "2,Mark", "3,Lone", "4,Hanne", "5,Helle"}));
        groups.add(createGroup("OOP", "oop-02", 3, new String[]{"6,Josh", "7,Manuel", "8,Peter"}));
        // Add more groups as needed...

        // Define the path to the output CSV file.
        String fileName = "medium_functionalities/csvfile.csv";
        
        // Call the method to write the list of groups to the CSV file.
        writeGroupsToFile(groups, fileName);
    }

    // Helper method to create a group with members
    private static Group createGroup(String courseId, String groupId, int numMembers, String[] members) {
        Group group = new Group(courseId, groupId, numMembers);
        for (String member : members) {
            group.addMember(member);
        }
        return group;
    }
}
