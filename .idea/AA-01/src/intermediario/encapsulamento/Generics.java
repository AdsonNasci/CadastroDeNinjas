package intermediario.encapsulamento;
import java.util.ArrayList;
import java.util.List;

public class Generics <T>{
    private List<T> equipamentos;
    // all-args constructor

    public Generics() {
        this.equipamentos = new ArrayList<>();
    }
    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public void setEquipamentos(List<T> equipamentos){
        this.equipamentos = equipamentos;
    }
    public String getEquipamentos(){
        return equipamentos.toString();
    }
    @Override
    public String toString() {
        return "Generics{" + "equipamentos=" + equipamentos + '}';
    }

}
