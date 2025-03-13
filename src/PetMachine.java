public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    // Construtor
    public PetMachine() {
        this.clean = true;
        this.water = 30;
        this.shampoo = 10;
    }

    public void takeAShower() {
        if (this.pet == null){
            System.out.println("Insert a pet first!");
            return;
        }

        // Cada banho deve consumir 10 de água e 5 de shampoo
        water -= 10;
        shampoo -= 5;

        pet.setClean(true);
        System.out.println("Your pet"+pet.getName()+" is clean!");
               
    }

    public void addWater(){
        if (water == 30){
            System.out.println("Water tank is full!");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("Shapoo tank is full!");
            return;
        }
        shampoo += 1;
    }

    // Getters

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    // A máquina de banho deve permitir apenas 1 pet por vez
    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("Your machine is not clean!");
            return;
        }
        if (this.pet != null){
            System.out.println("You already have a pet: "+this.pet.getName()+" on the machine!");
            return;
        }
        this.pet = pet;
    }

    // Método para remover o pet da máquina
    public void removePet(){
        if (this.pet == null){
            System.out.println("There is no pet on the machine!");
            return;
        }
        this.clean = this.pet.isClean(); //altera estado da máquina
        System.out.println("Pet "+this.pet.getName()+ " removed!");
        this.pet = null;
    }
    
    // Método para limpar a máquina
    public void washMachine(){
        // A limpeza da máquina deve consumir 10 de água e 2 de shampoo
        water -= 10;
        shampoo -= 2;
        this.clean = true;
        System.out.println("Your machine was cleaned!");
    }

}