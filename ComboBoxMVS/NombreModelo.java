package ComboBoxMVS;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class NombreModelo implements ComboBoxModel {
    ArrayList<String> datos;
    String selected;

    public NombreModelo() {
        datos = new ArrayList<>();
    }

    public NombreModelo(ArrayList<String> datos) {
        this.datos = datos;
    
    }
    

    @Override
    public void setSelectedItem(Object anItem) {
        this.selected = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.hashCode();
    }

    @Override
    public Object getElementAt(int index) {
        return null;
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
    public void agregarNombre(String nom){
        datos.add(nom);
    }

}
