package edu.chunjae.model;

import edu.chunjae.dto.Custom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomDAO {

    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    public List<Custom> getCustomList(){
        List<Custom> cusList = new ArrayList<>();
        DBConnect con = new PostgreCon();



        return cusList;
    }

    public Custom getCustom(String id){
        Custom cus = new Custom();


        return cus;
    }

    public boolean login(String id, String pw){
        boolean pass = false;

        return pass;
    }


}
