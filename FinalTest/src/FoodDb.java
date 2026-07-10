import java.sql.*;

class FoodDb {
    private Connection connect;
    private PreparedStatement pStatement;
    boolean foodExist;

    public void dbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/food_db";
            String username = "root";
            String pass = "Adarsh2211";
            connect = DriverManager.getConnection(url, username, pass);

        } catch (Exception e) {throw new RuntimeException(e);}
    }

    public void addFood(int foodId, String foodName, String foodCategory, double foodPrice, int foodAvailable) {
        try {
            String sql = "INSERT INTO food_table(fid, fName, fCategory, fPrice, fAvail) VALUES(?,?,?,?,?)";
            pStatement = connect.prepareStatement(sql);
            pStatement.setInt(1, foodId);
            pStatement.setString(2, foodName);
            pStatement.setString(3, foodCategory);
            pStatement.setDouble(4, foodPrice);
            pStatement.setInt(5, foodAvailable);
            pStatement.executeUpdate();
            System.out.println("Food added successfully!");

        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }





    public void displayFood() {
        try {
            String sql = "SELECT * FROM food_table";
            pStatement = connect.prepareStatement(sql);
            ResultSet rSet = pStatement.executeQuery();

            System.out.println("FoodID \tFood Name \tFood Category \tFood Price \tFood Available");

            while (rSet.next()) {
                System.out.println(rSet.getInt(1)
                        + "\t" + rSet.getString(2)
                        + "\t" + rSet.getString(3)
                        + "\t" + rSet.getDouble(4)
                        + "\t" + rSet.getInt(5));
            }
        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }




    public void searchFood(int id) {
        try {

            String sql = "SELECT * FROM food_table WHERE fid = ?";

            pStatement = connect.prepareStatement(sql);
            pStatement.setInt(1, id);
            ResultSet rSet = pStatement.executeQuery();

            if (rSet.next()) {
                System.out.println("Food Exists! \nDetails: ");
                System.out.println(rSet.getInt(1)
                        + "\t" + rSet.getString(2)
                        + "\t" + rSet.getString(3)
                        + "\t" + rSet.getDouble(4)
                        + "\t" + rSet.getInt(5));
                        foodExist = true;


            } else{
                System.out.println("Food with ID: " + id + " doesn't exist.");
                foodExist = false;
            }

        } catch (SQLException e) {System.out.println("ERROR : "+e);}


    }




    public void updateFood(int id, String foodName, String foodCategory, double foodPrice, int foodAvailable) {
        try {
            if(!foodExist)System.out.println("Food Dosent Exist !");
            else {

            String sql = "UPDATE food_table SET fName=?, fCategory=?, fPrice=?, fAvail=? WHERE fid=?";
            pStatement = connect.prepareStatement(sql);
            pStatement.setString(1, foodName);
            pStatement.setString(2, foodCategory);
            pStatement.setDouble(3, foodPrice);
            pStatement.setInt(4, foodAvailable);
            pStatement.setInt(5, id);

            int success = pStatement.executeUpdate();
            if (success > 0) System.out.println("Data Update Success");
            else System.out.println("Data Update Failed");
            }

        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }




    public void deleteFood(int id) {
        try {
            String sql = "DELETE FROM food_table WHERE fid = ?";
            pStatement = connect.prepareStatement(sql);
            pStatement.setInt(1, id);

            int success = pStatement.executeUpdate();
            if (success > 0) System.out.println("Data Delete Success");
            else System.out.println("Data Delete Failed");


        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }



    public void sortByWithCategory(String category) {
        try {
            String sql = "SELECT * FROM food_table WHERE fCategory = ?";
            pStatement = connect.prepareStatement(sql);
            pStatement.setString(1, category);
            ResultSet rSet = pStatement.executeQuery();

            System.out.println("FoodID \tFood Name \tFood Category \tFood Price \tFood Available");
            while (rSet.next()) {
                System.out.println(rSet.getInt(1) + "\t"
                        + rSet.getString(2)
                        + "\t" + rSet.getString(3)
                        + "\t" + rSet.getDouble(4)
                        + "\t" + rSet.getInt(5));
            }
        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }

    public void closeConnection() {
        try {
            pStatement.close();
            connect.close();

        } catch (SQLException e) {System.out.println("ERROR : "+e);}
    }
}