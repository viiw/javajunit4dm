/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeniou.soufiane.company.dmjavaadneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import zeniou.soufiane.company.dmjavaadneom.PartitionService;
import zeniou.soufiane.company.dmjavaadneom.PartitionServiceImplementation;

/**
 *
 * @author Soufiane ZENIOU
 */
@RunWith(Parameterized.class)
public class PartitionServiceTest {
    /*PartitionServiceTest*/
    private PartitionService partitionService;
    private static List<Integer> initialList;
    private int partion;
    private int nbrPartitionExpected;

    @Parameters
    public static Collection<Object[]> testParamaters() {
        return Arrays.asList(new Object[][]{
            {initialList, 2, 3},
            {initialList, 3, 2},
            {initialList, 1, 5},
            {initialList, 6, 1},
            {initialList, -1, 0}
        });
    }

    public PartitionServiceTest(PartitionService partitionService, int partion, int nbrPartitionExpected) {
        this.partitionService = partitionService;
        this.partion = partion;
        this.nbrPartitionExpected = nbrPartitionExpected;
    }

    @Before
    public void beforeTest() {
        partitionService = new PartitionServiceImplementation();
        initialList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    }

    @Test
    public void testPartition() {

        Assert.assertEquals(partitionService.partition(initialList, partion).size(), nbrPartitionExpected);
        Assert.assertNotNull(partitionService.partition(initialList, partion));

    }

}
