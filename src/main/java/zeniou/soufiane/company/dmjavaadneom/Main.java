/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeniou.soufiane.company.dmjavaadneom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {

        PartitionService partitionService = new PartitionServiceImplementation();

        List<Integer> initialList;
        initialList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Results: " + partitionService.partition(initialList, 6).toString());
        System.out.println("Results: " + partitionService.partition(initialList, 3).toString());
        System.out.println("Results: " + partitionService.partition(initialList, 1).toString());

    }

}
