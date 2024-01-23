package ra.model;

public abstract class Animals {
    private String type;
    private byte gen;
    public void makeSound(){
        System.out.println("");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getGen() {
        return gen;
    }

    public void setGen(byte gen) {
        this.gen = gen;
    }
}
