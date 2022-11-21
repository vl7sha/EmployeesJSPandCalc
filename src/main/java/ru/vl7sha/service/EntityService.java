package ru.vl7sha.service;

import ru.vl7sha.model.Entity;
import ru.vl7sha.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityService extends ConnectionDB {

    public List<Entity> getAll(){
        List<Entity> entities = new ArrayList<>();

        String sql = "SELECT * FROM \"Entity\"";

        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Entity entity = new Entity();
                entity.setIdEmployee(rs.getInt("id_employee"));
                entity.setName(rs.getString("name"));
                entity.setManager(rs.getString("manager"));
                entity.setSalary(rs.getDouble("salary"));
                entity.setNameSubdivision(rs.getString("name_subdivision"));
                entity.setDepartmentCityLocation(rs.getString("department_city_location"));
                entity.setCategory(rs.getInt("category"));
                entities.add(entity);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entities;
    }

    public Entity getById(int id){
        String sql = "SELECT * FROM \"Entity\" WHERE id_employee = " + id;

        Entity entity = new Entity();

        try(Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet rs = preparedStatement.executeQuery();

           while (rs.next()){
               entity.setIdEmployee(rs.getInt("id_employee"));
               entity.setName(rs.getString("name"));
               entity.setManager(rs.getString("manager"));
               entity.setSalary(rs.getDouble("salary"));
               entity.setNameSubdivision(rs.getString("name_subdivision"));
               entity.setDepartmentCityLocation(rs.getString("department_city_location"));
               entity.setCategory(rs.getInt("category"));
           }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entity;
    }

    public Entity getByName(String name){
        String sql = "SELECT * FROM \"Entity\" WHERE name LIKE '%"+name+"%'";

        Entity entity = new Entity();

        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {


            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                entity.setIdEmployee(rs.getInt("id_employee"));
                entity.setName(rs.getString("name"));
                entity.setManager(rs.getString("manager"));
                entity.setSalary(rs.getDouble("salary"));
                entity.setNameSubdivision(rs.getString("name_subdivision"));
                entity.setDepartmentCityLocation(rs.getString("department_city_location"));
                entity.setCategory(rs.getInt("category"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entity;
    }
}
