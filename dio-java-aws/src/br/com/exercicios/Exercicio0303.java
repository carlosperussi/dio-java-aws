import java.util.Scanner;

public class Exercicio0303 {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("================================");
            System.out.println("1) Dar banho no pet;");
            System.out.println("2) Abastecer a máquina com água;");
            System.out.println("3) Abastecer a máquina com shampoo;");
            System.out.println("4) Verificar água da máquina;");
            System.out.println("5) Verificar shampoo da máquina;");
            System.out.println("6) Verificar se há pet no banho;");
            System.out.println("7) Colocar pet na máquina;");
            System.out.println("8) Retirar pet da máquina;");
            System.out.println("9) Limpar máquina;");
            System.out.println("0) Sair.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    setWater();
                    break;
                case 3:
                    setShampoo();
                    break;
                case 4:
                    verifyWater();
                    break;
                case 5:
                    verifyShampoo();
                    break;
                case 6:
                    checkIfHasPetInMachine();
                    break;
                case 7:
                    setPetInMachine();
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.wash();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(option != 0);
        
    }

    public static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.next();    
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }

    public static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina." : "Não tem pet na máquina.");
    }

    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + amount + " litros de shampoo.");
    }

    public static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está com " + amount + " litros de água.");
    }

    private static void setWater() {
        petMachine.addWater();
        System.out.println("Tentando colocar água na máquina;");
    }

    private static void setShampoo() {
        petMachine.addShampoo();
        System.out.println("Tentando colocar shampoo na máquina;");
    }
}
