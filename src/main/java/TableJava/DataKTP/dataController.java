/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableJava.DataKTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author ROG
 */
@Controller
public class dataController {
     @RequestMapping("/tabledata")
    public String getTable (Model Table) 
    {
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("Nama","No.KTP","ID","Alamat"));
        data.add(Arrays.asList("Zulfa","2020010","00001","Lombok"));
        data.add(Arrays.asList("Loly","2020011", "00002","Papua"));
        data.add(Arrays.asList("moly","2020012", "00003","Mamuju"));
        data.add(Arrays.asList("cimol","2020013", "00004","Bangka"));
        data.add(Arrays.asList("celly","2020014", "00005","Bajo"));
        data.add(Arrays.asList("ciloy","2020015", "00006","Bungker"));
        data.add(Arrays.asList("della","2020016", "00007","Nusa"));
        data.add(Arrays.asList("delloy","2020017", "00008","Peninda"));
        data.add(Arrays.asList("mila","2020018", "00009","Ganjar"));
        data.add(Arrays.asList("mile","2020019", "00010","Riau"));
        data.add(Arrays.asList("milo","2020020", "00011","Merauke"));
        data.add(Arrays.asList("nila","2020021", "00012","Sabang"));
        data.add(Arrays.asList("nile","2020022", "00013","Bali"));
        data.add(Arrays.asList("nili","2020023", "00014","Bangka"));
        data.add(Arrays.asList("selly","2020024", "00015","Makassar"));
        data.add(Arrays.asList("silly","2020025", "000016","Bengkulu"));
        data.add(Arrays.asList("silol","2020026", "000017","Lampung"));
        data.add(Arrays.asList("zulfi","2020027", "000018","Jakarta"));
        data.add(Arrays.asList("zelfi","2020028", "000019","Banten"));
        data.add(Arrays.asList("zalfa","2020029", "000020","Solo"));
        
        Table.addAttribute("tabel", data );
        return "tableviewer";
    }
}
    


