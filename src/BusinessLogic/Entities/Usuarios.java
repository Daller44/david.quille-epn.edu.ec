package BusinessLogic.Entities;

public class Usuarios {
    private String dqUsuario;
    private String dqCPass;
    
    public Usuarios(String dqUsuario, String dqCPass) {
        this.dqUsuario = dqUsuario;
        this.dqCPass = dqCPass;
    }
    
    public Usuarios(String string) {
    }

    public String getdqUsuario() {
        return dqUsuario;
    }
    public void setdqUsuario(String dqUsuario) {
        this.dqUsuario = dqUsuario;
    }
    public String getdqCPass() {
        return dqCPass;
    }
    public void setdqCPass(String dqCPass) {
        this.dqCPass = dqCPass;
    }

}
