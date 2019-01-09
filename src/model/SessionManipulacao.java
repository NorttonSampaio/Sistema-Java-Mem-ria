package model;

import control.Par;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import dao.NewHibernateUtil;
import java.awt.Frame;
import org.hibernate.HibernateException;

public class SessionManipulacao {
    Session s=null;
    
    public SessionManipulacao(){
        
    }
    
    //Inserir
    
public void save(Par p, Frame ifr){
    try{
        s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(p);
    }catch(HibernateException ex){
        JOptionPane.showMessageDialog(ifr, ex);
    }finally{
        s.getTransaction().commit();
        s.close();
    }
}
    
    //Atualizar
    public void update(Par p, Frame ifr){
        try{
            s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.merge(p);
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(ifr, ex);
            ex.printStackTrace();
        }finally{
            s.getTransaction().commit();
            s.close();
        }
    }
    
    //Deletar
    public void delete(Par p, Frame ifr){
        try{
            s = NewHibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.delete(p);
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(ifr, ex);
            ex.printStackTrace();
        }finally{
            s.getTransaction().commit();
            s.close();
        }
    }
}
