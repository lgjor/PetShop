import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        
        var option = -1;
        do {
            System.out.println("=== Pet Machine ===");
            System.out.println("=== 1 - Verificar água ===");
            System.out.println("=== 2 - Abastecer água ===");
            System.out.println("=== 3 - Verificar Shampoo ===");
            System.out.println("=== 4 - Abastecer Shampoo ===");
            System.out.println("=== 5 - Verificar se tem pet no banho ===");
            System.out.println("=== 6 - Colocar pet na máquina ===");
            System.out.println("=== 7 - Dar banho no pet ===");
            System.out.println("=== 8 - Retirar pet da máquina ===");
            System.out.println("=== 9 - Limpar máquina ===");
            System.out.println("=== 0 - Sair ===");
            System.out.print("Digite a opção desejada: ");
            option = scanner.nextInt();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> verifyWatter();
                case 2 -> setWater();
                case 3 -> verifyShampoo();
                case 4 -> setShampoo();
                case 5 -> hasPetOnPetMachine();
                case 6 -> setPetOnPetMachine();
                case 7 -> petMachine.takeAShower();                    
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
   
    }

    private static void setWater() {
        System.out.println("Colocando água na máquina...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Colocando shampoo na máquina...");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com: " + petMachine.getShampoo()+" Litros de Shampoo.");
    }

    private static void verifyWatter() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está com: " + petMachine.getWater()+" Litros de água.");
    }

    // Método para inserir o pet na máquina
    public static void setPetOnPetMachine(){
        var name = "";
        
        // Validar se o nome do pet foi informado
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet:");
            name =  scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet "+ pet.getName()+" foi colocado na máquina");
    }

    // Método para verificar se tem pet na máquina
    public static void hasPetOnPetMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem o pet na máquina!" : "Não tem pet na máquina!");
    }
}
