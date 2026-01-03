public class Carro {
    private String modeloDoCarro;
    private boolean estadoDoMotor;
    private int marchaAtual;
    private float velocidadeAtual;
    private String direcaoDoCarro;

    public Carro() {
        this.modeloDoCarro = "Fiat Uno";
        this.estadoDoMotor = false;
        this.marchaAtual = 0;
        this.velocidadeAtual = 0;
        this.direcaoDoCarro = "Reto";
    }

    public void setEstadoDoMotor(boolean estadoDoMotorParam) {
        this.estadoDoMotor = estadoDoMotorParam;
    }

    public boolean getEstadoDoMotor() {
        return this.estadoDoMotor;
    }

    public void setVelocidadeAtual(float velocidadeDoCarroParam) {
        this.velocidadeAtual = velocidadeDoCarroParam;
    }

    public void setMarcha(int marchaAtualTemp) {
        this.marchaAtual = marchaAtualTemp;
    }

    public int getMarcha() {
        return this.marchaAtual;
    }

    public float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getDirecaoAtual() {
        return this.direcaoDoCarro;
    }

    public void setDirecaoAtual(String direcaoDoCarroParam) {
        this.direcaoDoCarro = direcaoDoCarroParam;
    }
}
