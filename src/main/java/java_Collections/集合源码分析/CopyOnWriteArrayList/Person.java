package java_Collections.集合源码分析.CopyOnWriteArrayList;


import java.util.List;

public class Person {
    private List<Integer> roles;

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
}
