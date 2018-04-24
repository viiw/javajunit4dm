/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeniou.soufiane.company.dmjavaadneom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soufiane ZENIOU
 */
public class PartitionServiceImplementation implements PartitionService {

    @Override
    public List<List<Integer>> partition(List<Integer> initialList, int nbrPartition) {

        List<List<Integer>> result = new ArrayList<>();

        if (initialList != null && !initialList.isEmpty() && nbrPartition > 0) {

            int i = 0;
            int listSize;
            listSize = initialList.size();
            int step = nbrPartition;

            while (i < listSize) {

                if (i + step > listSize) {
                    step = listSize - i;
                }

                result.add(initialList.subList(i, i + step));

                i += step;

            }

        }

        return result;

    }

}
