import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface UserActions {
    void saveUserInfo(String userInfo);

    void resetUserInfo();
}

abstract class User {
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract String displayInfo();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class RegularUser extends User {
    private String address;

    public RegularUser(String name, String id, String address) {
        super(name, id);
        this.address = address;
    }

    @Override
    public String displayInfo() {
        return "Regular User Information:\nName: " + getName() + "\nID: " + getId() + "\nAddress: " + address;
    }
}

class AdminUser extends User {
    private int adminLevel;

    public AdminUser(String name, String id, int adminLevel) {
        super(name, id);
        this.adminLevel = adminLevel;
    }

    @Override
    public String displayInfo() {
        return "Admin User Information:\nName: " + getName() + "\nID: " + getId() + "\nAdmin Level: " + adminLevel;
    }
}

class UserManagement implements UserActions {
    private List<User> userList;
    private JTextArea displayArea;
    private JTextField nameField, idField;

    public UserManagement(JTextArea displayArea, JTextField nameField, JTextField idField) {
        this.userList = new ArrayList<>();
        this.displayArea = displayArea;
        this.nameField = nameField;
        this.idField = idField;
    }

    @Override
    public void saveUserInfo(String userInfo) {
        displayArea.setText(userInfo);
        userList.add(createUserObject(userInfo));
        System.out.println("Information saved: " + userInfo);
    }

    @Override
    public void resetUserInfo() {
        displayArea.setText("");
        userList.clear();
        System.out.println("Information reset");
    }

    private User createUserObject(String userInfo) {
        String[] info = userInfo.split("\n");
        if (info.length >= 3) {
            String name = info[1].substring(6);
            String id = info[2].substring(4);
            if (userInfo.contains("Address:")) {
                String address = info[3].substring(9);
                return new RegularUser(name, id, address);
            } else if (userInfo.contains("Admin Level:")) {
                int adminLevel = Integer.parseInt(info[3].substring(13));
                return new AdminUser(name, id, adminLevel);
            }
        }
        return null;
    }

    public List<User> getUserList() {
        return userList;
    }
}

public class UserInfo {
    private JTextArea userInfoTextArea;
    private JTextField nameField, idField;

    public UserInfo() {
        JFrame frame = new JFrame("User Information Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();

        JButton saveButton = new JButton("Save");
        JButton resetButton = new JButton("Reset");
        JButton seeUserButton = new JButton("See User");

        userInfoTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(userInfoTextArea);

        UserManagement userManagement = new UserManagement(userInfoTextArea, nameField, idField);

        saveButton.addActionListener(e -> {
            String userInfo = "Name: " + nameField.getText() + "\nID: " + idField.getText();
            userManagement.saveUserInfo(userInfo);
        });

        resetButton.addActionListener(e -> userManagement.resetUserInfo());

        seeUserButton.addActionListener(e -> displayUserInformation(userManagement.getUserList()));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(saveButton);
        panel.add(resetButton);
        panel.add(seeUserButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void displayUserInformation(List<User> userList) {
        JFrame displayFrame = new JFrame("Saved User Information");
        displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        displayFrame.setSize(300, 200);
        displayFrame.setLocationRelativeTo(null);

        JTextArea displayTextArea = new JTextArea();
        displayTextArea.setEditable(false);

        for (User user : userList) {
            displayTextArea.append(user.displayInfo() + "\n\n");
        }

        JScrollPane scrollPane = new JScrollPane(displayTextArea);

        displayFrame.add(scrollPane);
        displayFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserInfo::new);
    }
}
