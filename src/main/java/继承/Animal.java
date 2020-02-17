package 继承;

public abstract class Animal {
    private String name;
    private int money;
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object another) {
        if (this==another){
            return true;
        }
        if (another instanceof Animal){
            Animal anotherAnimal = (Animal) another;
            if (this.getName()!=null
                    &&(anotherAnimal).getName()!=null
                    && this.getName().equals(anotherAnimal.getName())){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
