package aula14;

public class AulaHeranca extends FuncionariosHospitais{
    static void main(String[] args) {
        FuncionariosHospitais mariaMedica = new FuncionariosHospitais();
        mariaMedica.baterPonto();
        mariaMedica.dormem();
        FuncionariosHospitais joaodoRH = new FuncionariosHospitais();
        oftalmologista alineOftalmo = new oftalmologista();
        alineOftalmo.passarCracha();


    }
}
