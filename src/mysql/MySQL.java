/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import OneThousand.CreateWithConnection1k;
import OneThousand.CreateWithoutConnection1k;
import OneThousand.DeleteWithConnection1k;
import OneThousand.DeleteWithoutConnection1k;
import OneThousand.RetrieveWithoutConnection1k;
import TwoHundred.CreateWithConnection200;
import TwoHundred.CreateWithoutConnection200;
import TwoHundred.DeleteWithConnection200;
import TwoHundred.DeleteWithoutConnection200;

/**
 *
 * @author laurentera_sd2022
 */
public class MySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        CreateWithConnection200 cwc = new CreateWithConnection200();
//        cwc.Insert();
//        CreateWithoutConnection200 cwoc = new CreateWithoutConnection200();
//        cwoc.Insert();
//        CreateWithoutConnection1k cwoc = new CreateWithoutConnection1k();
//        cwoc.Insert();
//        CreateWithConnection1k cwc = new CreateWithConnection1k();
//        cwc.Insert();
//        DeleteWithoutConnection200 dwoc = new DeleteWithoutConnection200();
//        dwoc.Delete();
//        DeleteWithConnection200 dwoc = new DeleteWithConnection200();
//        dwoc.Delete();
        
//        DeleteWithConnection1k dwc = new DeleteWithConnection1k();
//        dwc.Delete();
        
//        DeleteWithoutConnection1k dwoc = new DeleteWithoutConnection1k();
//        dwoc.Delete();
        
        RetrieveWithoutConnection1k rwoc = new RetrieveWithoutConnection1k();
        rwoc.Retrieve();
        
    }

}
