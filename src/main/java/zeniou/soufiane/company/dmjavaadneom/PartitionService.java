/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeniou.soufiane.company.dmjavaadneom;

import java.util.List;

/**
 *
 * @author Soufiane ZENIOU
 */
public interface PartitionService {

    /*
    La fonction « partition » qui prend un paramètre « liste » et un paramètre
    « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum
    « taille » éléments.
     */
    
    List<List<Integer>> partition(List<Integer> initialList, int nbrPartition);

}
