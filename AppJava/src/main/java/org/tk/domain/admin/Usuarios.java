package org.tk.domain.admin;

public abstract class Usuarios implements Cloneable{

    public static enum Papeis{
        Administradores,
        Desenvolvedores,
        Registrados,
        Anonimos
    }
    public static enum Privilegios{
        Geral,
        Criador,
        Editor,
        Visualizar
    }
    public static enum Loguin{
        Admin,
        Users,
        Viewer
    }

    private int id;
    protected Papeis papeis;
    protected Privilegios privilegios;
    protected Loguin loguin;

    public abstract void criarUsuario();

    public Usuarios(){

    }
    public Usuarios(int id, Papeis papeis, Privilegios privilegios, Loguin loguin){
        super();

        this.id = id;
        this.papeis = papeis;
        this.privilegios = privilegios;
        this.loguin = loguin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Papeis getPapeis() {
        return papeis;
    }

    public void setPapeis(Papeis papeis) {
        this.papeis = papeis;
    }

    public Privilegios getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(Privilegios privilegios) {
        this.privilegios = privilegios;
    }

    public Loguin getLoguin() {
        return loguin;
    }

    public void setLoguin(Loguin loguin) {
        this.loguin = loguin;
    }

    @Override
    protected Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
    @Override
    public String toString(){
        StringBuffer detalhes = new StringBuffer();
        detalhes.append("Id: " + id);
        detalhes.append("Papeis: " + papeis);
        detalhes.append("Privilegios: " + privilegios);
        detalhes.append("Loguin: " + loguin);
        return detalhes.toString();
    }
}
