/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.bsearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void test1(){
        int key = 3;
        int[] seq = new int[]{3};
        SearchResult result;
        BinarySearch binarySearch = new BinarySearch();
        result = binarySearch.search(key,seq);
        boolean expResult = true;
        int i = result.getPosition();
        assertEquals(expResult, (result.isFound() && seq[i-1]==key) );
        
    }
    
    @Test
    public void test2(){
        int key = 5;
        int[] seq = new int[]{3};
        SearchResult result;
        BinarySearch binarySearch = new BinarySearch();
        result = binarySearch.search(key,seq);
        boolean expResult = true;
        int i = result.getPosition();
        assertEquals(expResult, (!result.isFound() && result.getPosition()==-1) );
    }
    
    @Test
    public void test3(){
        int key = 5;
        int[] seq = new int[]{5,6,7,8};
        SearchResult result;
        
        result = BinarySearch.search(key,seq);
        boolean expResult = true;
        int i = result.getPosition();
        assertEquals(expResult, (result.isFound() && seq[i-1]==key));
    }
    
    @Test
    public void test4(){
        int key = 8;
        int[] seq = new int[]{5,6,7,8};
        SearchResult result;
        
        result = BinarySearch.search(key,seq);
        boolean expResult = true;
        int i = result.getPosition();
        assertEquals(expResult, (result.isFound() && seq[i-1]==key));
    }
    
    @Test
    public void test5(){
        int key = 7;
        int[] seq = new int[]{5,6,7,8,9};
        SearchResult result;
        
        result = BinarySearch.search(key,seq);
        boolean expResult = true;
        int i = result.getPosition();
        assertEquals(expResult, (result.isFound() && seq[i-1]==key));
    }
    
}
