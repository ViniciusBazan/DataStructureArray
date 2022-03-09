/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayalunos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinícius Verissimo Bazan
 */
public class ArrayAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      //funcaoErrada();
      funcaoCerta();
    }

    public static void funcaoErrada(){
        String[] alunos = {"Ana","Beatriz","Carlos","Daniel","Eduardo","Fernanda","Gabriela","Henrique","Isabel","João","Kaique","Luíza","Mario","Naiara","Osvaldo","Pedro","Queila","Rita","Simone","Tiago","Ulias","Vinícius","Wesley","Yago","Zilda"};
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Aluno nº "+(i+1)+": "+ alunos[i]);
        }
        System.out.println("");

       alunos[25] = "Peterson";
       alunos[26] = "Flávia";
       alunos[27] = "Lara";
       alunos[28] = "Loren";
       alunos[29] = "Logan";
    }

   public static void funcaoCerta(){
       List<String> alunos = new ArrayList<>();
       alunos.add("Ana");
       alunos.add("Beatriz");
       alunos.add("Carlos");
       alunos.add("Daniel");
       alunos.add("Eduardo");
       alunos.add("Fernanda");
       alunos.add("Gabriela");
       alunos.add("Henrique");
       alunos.add("Isabel");
       alunos.add("João");
       alunos.add("Kaique");
       alunos.add("Luíza");
       alunos.add("Mario");
       alunos.add("Naiara");
       alunos.add("Osvaldo");
       alunos.add("Pedro");
       alunos.add("Queila");
       alunos.add("Rita");
       alunos.add("Simone");
       alunos.add("Tiago");
       alunos.add("Ulias");
       alunos.add("Vinícius");
       alunos.add("Wesley");
       alunos.add("Yago");
       alunos.add("Zilda");
     
       System.out.println("Alunos cadastrados: "+alunos.size());
   
       alunos.add("Peterson");
       alunos.add("Flávia");
       alunos.add("Lara");
       alunos.add("Loren");
       alunos.add("Logan");

       System.out.println("Alunos cadastrados: "+alunos.size());

       for(int i = 0; i < alunos.size(); i++){
           System.out.println("Aluno nº "+(i+1)+": "+alunos.get(i));
    }
    }

    
}

