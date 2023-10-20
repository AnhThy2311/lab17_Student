/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.List;
import model.InformationStudent;

/**
 *
 * @author HP
 */
public interface IInformationStudentRepository {  
    
    public void sortStudent(List<InformationStudent> list);
    
    public void display(List<InformationStudent> list);
    
}
