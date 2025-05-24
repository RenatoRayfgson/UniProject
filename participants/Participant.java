package participants;

public abstract class Participant {
    protected String name;
    protected String email;
    protected String cpf;
    protected int type; //1 - Guest, 2 - Professor, 3 - Student

    public Participant(String name, String email, String cpf, int type){
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.type = type;
    }

    public void register(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
