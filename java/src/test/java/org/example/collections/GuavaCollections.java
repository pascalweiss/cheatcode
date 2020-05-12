package org.example.collections;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Guava provides some static factory methods for
 * creating collections. This file provides some
 * - by no means exhaustive - examples.
 */
public class GuavaCollections {
    List<Integer> l1 = Lists.newArrayList(1,2,3);
    List<Integer> l2 = Lists.newArrayList(10,11);
    Set<Integer> s1 = Sets.newHashSet(1,2,3);
    Set<Integer> s2 = Sets.newHashSet(10,11);
    Integer[] a = new Integer[0];

    @Test public void lists() {
        Lists.newArrayList(1,2,3); // Creates an ArrayList with fixed
        Lists.newCopyOnWriteArrayList(l1);   // Creates a copy of a list
        Lists.asList(1, a);             // Creates a list by adding an element to an (fixed size) array.
        Lists.reverse(l1);                   // Reverses the list
        Lists.partition(l1, 3);         // Creates 3 partitions;
        Lists.cartesianProduct(l1, l2);      // Creates [(1,10), (1,11), ..., (3, 11)]
    }

    @Test public void sets() {
        Sets.newHashSet(1,2,3);
        Sets.union(s1,s2);                  // s1 ∪ s2
        Sets.difference(s1,s2);             // s1 / s2
        Sets.intersection(s1,s2);           // s1 ∩ s2
        Sets.powerSet(s2);                  // Creates {{}, {10}, {11}, {10, 11}}
        Sets.combinations(s1, 1);      // Creates {{}, {10}, {11}}
    }

    @Test public void maps() {
        Maps.asMap(s2, Object::toString); // creates {10: "10", 11: "11"}
    }

}
