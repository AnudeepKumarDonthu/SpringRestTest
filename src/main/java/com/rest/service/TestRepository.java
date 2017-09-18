/**
 * 
 */
package com.rest.service;

import org.springframework.stereotype.Repository;

/**
 * @author AnudeepKumar
 *
 */
@Repository("testRepository")
public class TestRepository {
	
	public void testMethod() {
		System.out.println("Method in Repository");
	}

}
