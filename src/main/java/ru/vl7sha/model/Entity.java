package ru.vl7sha.model;

public class Entity {
    private int idEmployee;
    private String name;
    private String manager;
    private double salary;
    private String nameSubdivision;
    private String departmentCityLocation;
    private int category;

    public Entity() {
    }

    public Entity(int idEmployee, String name,
                  String manager, double salary, String nameSubdivision,
                  String departmentCityLocation, int category) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.manager = manager;
        this.salary = salary;
        this.nameSubdivision = nameSubdivision;
        this.departmentCityLocation = departmentCityLocation;
        this.category = category;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameSubdivision() {
        return nameSubdivision;
    }

    public void setNameSubdivision(String nameSubdivision) {
        this.nameSubdivision = nameSubdivision;
    }

    public String getDepartmentCityLocation() {
        return departmentCityLocation;
    }

    public void setDepartmentCityLocation(String departmentCityLocation) {
        this.departmentCityLocation = departmentCityLocation;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", salary=" + salary +
                ", nameSubdivision='" + nameSubdivision + '\'' +
                ", departmentCityLocation='" + departmentCityLocation + '\'' +
                ", category=" + category +
                '}';
    }
}
