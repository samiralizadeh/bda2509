package petsystem;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class PetDB {

    // WRITE
    public static void insertPet(Pet pet) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();

            String sql = "INSERT INTO pet VALUES (DEFAULT, '" +
                    pet.getName() + "', '" + pet.getType() + "')";

            st.executeUpdate(sql);
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void showPets() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM pet");

            while (rs.next()) {
                System.out.println(
                        rs.getString("type") + ": " +
                                rs.getString("name")
                );
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updatePet(String oldName, String newName) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "UPDATE pet SET name='" + newName +
                            "' WHERE name='" + oldName + "'"
            );

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deletePet(String name) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "DELETE FROM pet WHERE name='" + name + "'"
            );

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
