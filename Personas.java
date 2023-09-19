public class Personas {
    private String nombre, apep, apem, sexo, dir;
    private int edad;
    private String correo, password, tel;

    // Constructor vacío
    public Personas() {
    }

    // Constructor con datos
    public Personas(String nombre, String apep, String apem, String sexo, String dir, int edad, String correo, String password, String tel) {
        this.nombre = nombre;
        this.apep = apep;
        this.apem = apem;
        this.sexo = sexo;
        this.dir = dir;
        this.edad = edad;
        this.correo = correo;
        this.password = password;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApep() {
        return apep;
    }

    public void setApep(String apep) {
        this.apep = apep;
    }

    public String getApem() {
        return apem;
    }

    public void setApem(String apem) {
        this.apem = apem;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
