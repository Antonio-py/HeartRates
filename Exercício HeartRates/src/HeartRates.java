public class HeartRates {

    // Atributos
    private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private int idade;


    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void idade(int diaHoje, int mesHoje, int anoHoje) {
        int anos = anoHoje - ano;
        int meses = mesHoje - mes;
        int dias = diaHoje - dia;
        idade = anos;
        if (meses < 0) {
            idade = anos -1;
        }
        if (meses == 0 && dias < 0) {
            idade = anos -1;
        }
    }

    public int frequenciaMaxima() {
        return 220 - idade;
    }

    public int frenquenciaAlvoMin() {
        return frequenciaMaxima() / 2;
    }
    public int frequenciaAlvoMax() {
        int max = (int) (frequenciaMaxima() * 0.85);
        return max;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
