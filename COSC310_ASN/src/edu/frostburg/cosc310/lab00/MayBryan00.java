package edu.frostburg.cosc310.lab00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bryan May
 * @version 2018.09.09
 */
public class MayBryan00 implements Lab00{
    
    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
    
    /**
     * Makes a large String ArrayList of Strings of numbers
     * @param size the # of times
     * @return how long it took
     */
    public long problem2(int size){
        List<String> stringAL = new ArrayList<>();
        long start = System.currentTimeMillis();
        
        for(int i = 0; i < size; i++){
            stringAL.add(Integer.toString(i));
        }
        
        long end = System.currentTimeMillis();
        
        return end - start;
    }
    
    /**
     * Makes a large String LinkedList of numbers
     * @param size the # of times
     * @return how long it took
     */
    public long problem2a(int size){
        List<String> stringLL = new LinkedList<>();
        long start = System.currentTimeMillis();
        
        for(int i = 0; i < size; i++){
            stringLL.add(Integer.toString(i));
        }
        
        long end = System.currentTimeMillis();
        
        return end - start;
    }
}
