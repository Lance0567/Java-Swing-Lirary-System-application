package swing;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.Model_Menu;

public class ListMenu<E extends Object> extends JList<E>{

    public ListMenu() {        
    }    

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int i, boolean bln, boolean blnl) {
                Model_Menu data;
            if (o instanceof Model_Menu){
                data = (Model_Menu) o;
            }else{
               data = new Model_Menu("", o + "", Model_Menu.MenuType.EMPTY);
            }
            MenuItem item = new MenuItem(data);        
            return item;
            }            
        };    
    }       
}
