package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        import package imported the package by adding the dependency
        load driver
        register driver
        create connection
        create statement
        execute statement
        close connection
         */
        String url = "jdbc:postgresql://localhost:4321/Demo";
        String uname = "postgres";
        String pass = "Hanuman@1905";
        String sql1 = "select sname from student where sid=1";
        String sql2 = "select * from student";
        String sql3 = "insert into student values (5,'bhanu',100)";
        String sql4 = "update student set sname = 'heshritha' where sid=5 ";
        String sql5 = "delete from student where sid=4 ";
        String preparedStatementSql = "insert into student values (?,?,?)";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("connections established....");
        Statement st = con.createStatement();


        /*handling single record
        ResultSet rs =  st.executeQuery(sql1);
        rs.next();
        System.out.println("first record in the table with student name: "+rs.getString("sname"));
        */

        /*handling multiple records
        ResultSet rs =  st.executeQuery(sql2);
        while(rs.next()){
            int sid = rs.getInt(1);
            String name = rs.getString(2);
            int mark = rs.getInt(3);
            System.out.println("\n id :" + sid + "\n name : "+ name+"\n marks :"+ mark +"\n");
        }
        */

        /*Inserting the data in db
        st.execute(sql3);
        */

        /*Update the record
        st.execute(sql4);
        */

        /*delete the record
        st.execute(sql5);
        */



        PreparedStatement pst = con.prepareStatement(preparedStatementSql);
        pst.setInt(1,6);
        pst.setString(2,"hanuma");
        pst.setInt(3,200);
        pst.execute();
        con.close();
        System.out.println("connection closed...");
        System.out.println("Hello world!");
    }
}